package bazar;

import java.util.ArrayList;

import bazar.Criterio.Criterio;

public abstract class ElementoAbstracto {

	private String nombre;

	public ElementoAbstracto(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double getPeso();
	public abstract double getPrecio();
	public abstract int cantidadProductos();
	public abstract ArrayList<String> getCategorias();
	public abstract ArrayList<ElementoAbstracto> buscar(Criterio c);
	public abstract ElementoAbstracto copia(Criterio c);
	public abstract Simple productoPesoBajo();
	
	
    public boolean tieneCategoria(String categoria){
        return this.getCategorias().contains(categoria);
    }
    
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
