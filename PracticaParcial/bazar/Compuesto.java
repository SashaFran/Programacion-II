package bazar;

import java.util.ArrayList;

import bazar.Criterio.Criterio;

public class Compuesto extends ElementoAbstracto {

	protected ArrayList<ElementoAbstracto> elementos;
	private double suma, descuentoTope, porcentajeProd;
	private Criterio c;
	
	public Compuesto(String nombre, double descuentoTope, double porcentajeProd, Criterio c) {
		super(nombre);
		this.elementos = new ArrayList<>();
		this.descuentoTope = descuentoTope;
		this.porcentajeProd = porcentajeProd;
		this.c = c;
		// TODO Auto-generated constructor stub
	}

	//tiene que cumplir con  una condicino para que permita el agregado
	public void addElemento(ElementoAbstracto e){
		if(c.cumple(e)){
			elementos.add(e);
		}
	}
	@Override
	public double getPeso() {
		this.suma = 0;
		for (ElementoAbstracto a: elementos){
			this.suma += a.getPeso();
		}
		return this.suma;
	}
	
	public double precioSinDescuento(){
		double total = 0;
		for (ElementoAbstracto a: elementos){
			total += a.getPrecio();
		}
		return total;
	}

	@Override
	public double getPrecio() {
		double total = precioSinDescuento();
		double porcentajeDescuento = this.cantidadProductos() * porcentajeProd;
			if(porcentajeDescuento > descuentoTope){
				porcentajeDescuento = descuentoTope;
			}
			
		return total - this.cantidadProductos() * porcentajeDescuento;
	}

	@Override
	public int cantidadProductos() {
		int total = 0;
		for(ElementoAbstracto e: elementos){
			total += e.cantidadProductos();
		}
		return total;
	}

	public double getDescuentoTope() {
		return descuentoTope;
	}

	public void setDescuentoTope(double descuentoTope) {
		this.descuentoTope = descuentoTope;
	}

	public double getPorcentajeProd() {
		return porcentajeProd;
	}

	public void setPorcentajeProd(double porcentajeProd) {
		this.porcentajeProd = porcentajeProd;
	}

	public ArrayList<ElementoAbstracto> getElementos() {
		return new ArrayList<ElementoAbstracto>(elementos);
	}

	@Override
	public ArrayList<String> getCategorias() {
		ArrayList<String> aux = new ArrayList<>();
		for(ElementoAbstracto e: elementos){
			ArrayList<String> categorias = e.getCategorias();
			for(String c: categorias)
				if(!aux.contains(c)){
					aux.add(c);
				}
		}
		return aux;
	}

	@Override
	public ArrayList<ElementoAbstracto> buscar(Criterio c) {
		ArrayList<ElementoAbstracto> aux = new ArrayList<>();
		if(c.cumple(this)){
			aux.add(this);
		}
		for(ElementoAbstracto e: elementos){
			 aux.addAll(e.buscar(c));
			}
		return aux;
	}

	@Override
	public ElementoAbstracto copia(Criterio c) {
		if(c.cumple(this)){
			Compuesto copia = new Compuesto(this.getNombre(),descuentoTope, porcentajeProd, c);
			for(ElementoAbstracto e: elementos){
				ElementoAbstracto copiaA = e.copia(c);
				if(copiaA != null)
					copia.addElemento(copiaA);
			}
			if(copia.tieneElementos())
				return copia;
		}
		return null;
	}

	private boolean tieneElementos() {
		return elementos.size()>0;
	}

	@Override
	public Simple productoPesoBajo() {
		double peso = 0;
		Simple producto = null;
		for(ElementoAbstracto e: elementos){
			Simple simpleAux = e.productoPesoBajo();
	           double temp = simpleAux.getPeso();
	           if (simpleAux==null || temp < peso){
	               peso = temp;
	               producto = simpleAux;
	           }
	       }
	       return producto;
	}
	
	

}
