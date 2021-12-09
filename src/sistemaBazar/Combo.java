package sistemaBazar;

import java.util.ArrayList;

public class Combo extends ElementoBazar{

	protected ArrayList<ElementoBazar> elementos;
	private Criterio criterio;
	private int porcentajeMin;
	private int porcentajeMax;

	
	public Combo(String nombre, Criterio c) {
		super(nombre);
		this.elementos = new ArrayList<>();
		this.setCriterio(c);
	}
	
	public void addElemento(ElementoBazar e){
		if(criterio.cumple(e))
			elementos.add(e);
	}

	public double getPrecioSinDescuento(){
		double suma = 0;
		for(ElementoBazar e: elementos)
			suma+= e.getPrecio();
		return suma;
	}
	
	@Override
	public double getPrecio() {
	     double precioTotal = getPrecioSinDescuento();
	        double porcentajeDescuento = porcentajeMin * cantElem();
	        if (porcentajeDescuento>this.porcentajeMax)
	            porcentajeDescuento = porcentajeMax;

	        return precioTotal - porcentajeDescuento*precioTotal;
	}
	
	@Override
	public double getPeso() {
		double total = 0;
		for (ElementoBazar e: elementos)
			total += e.getPeso();
		return total;
	}
	
	@Override
	public int cantElem() {
		int total = 0;
		for (ElementoBazar e: elementos)
			total += e.cantElem();
		return total;
	}
	

	@Override
	public ArrayList<String> getCategorias() {
	     ArrayList<String> categorias = new ArrayList<>();
	        for (ElementoBazar e: elementos){
	            ArrayList<String> catElem = e.getCategorias();
	            for (String cat:catElem)
	                if (!categorias.contains(cat))
	                    categorias.add(cat);
	        }
	        return categorias;
	}

	@Override
	public ArrayList<ElementoBazar> buscar(Criterio c) {
		ArrayList<ElementoBazar> aux = new ArrayList<>();
		if(c.cumple(this))
			aux.add(this);
		else{
			for(ElementoBazar e: elementos)
				aux.addAll(e.buscar(c));
		}
		return aux;
	}

	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}

	public void setPorcentajeMin(int porcentajeMin) {
		this.porcentajeMin = porcentajeMin;
	}

	public void setPorcentajeMax(int porcentajeMax) {
		this.porcentajeMax = porcentajeMax;
	}

	@Override
	public ElementoBazar copia(Criterio c) {
		if(c.cumple(this)){
			Combo copiaCombo = new Combo(this.getNombre(), criterio);
			for(ElementoBazar e: elementos){
				ElementoBazar copiaElemento = e.copia(c);
				if(copiaElemento!= null)
					copiaCombo.addElemento(copiaElemento);
			}
			if(copiaCombo.tieneElementos())
				return copiaCombo;
			
		}
		return null;
	}

	private boolean tieneElementos() {
		return !elementos.isEmpty();
	}



	
}
