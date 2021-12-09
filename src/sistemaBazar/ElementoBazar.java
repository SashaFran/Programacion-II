package sistemaBazar;

import java.util.ArrayList;

public abstract class ElementoBazar {

	private String nombre;

	public ElementoBazar(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public abstract double getPrecio();
	public abstract double getPeso();
	public abstract ArrayList<String> getCategorias();
	public abstract ArrayList<ElementoBazar> buscar(Criterio c);
	public abstract int cantElem();
	public abstract ElementoBazar copia(Criterio c);
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean contieneCategoria(String s){
		return this.getCategorias().contains(s);
	}
	
}
