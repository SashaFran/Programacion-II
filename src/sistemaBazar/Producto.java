package sistemaBazar;

import java.util.ArrayList;

public class Producto extends ElementoBazar{


	private ArrayList<String> categorias;
	private double peso, precio;
	
	
	public Producto(String nombre, Double peso, Double precio) {
		super(nombre);
		this.peso = peso;
		this.precio = precio;
		this.categorias = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	@Override
	public double getPeso() {
		return peso;
	}

	@Override
	public ArrayList<String> getCategorias() {
		return new ArrayList<String>(categorias);
	}

	@Override
	public ArrayList<ElementoBazar> buscar(Criterio c) {
		ArrayList<ElementoBazar> aux = new ArrayList<>();
		if (c.cumple(this))
			aux.add(this);
		return aux;
	}

	@Override
	public int cantElem() {
		return 1;
	}

	@Override
	public ElementoBazar copia(Criterio c) {
		if( c.cumple(this)){
			Producto copia = new Producto(this.getNombre(), peso, precio);
			for(String cat: categorias){
				copia.addCategoria(cat);
				return copia;
			}
		}
		
		return null;
	}
	
	public void addCategoria(String c){
		if (!categorias.contains(c))
			categorias.add(c);
	}
	
	
}
