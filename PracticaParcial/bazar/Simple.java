package bazar;

import java.util.ArrayList;
import bazar.Criterio.Criterio;

public class Simple extends ElementoAbstracto {

	private ArrayList<String> categorias;
	private double precio, peso;
	
	public Simple(String nombre, double precio, double peso) {
		super(nombre);
		this.precio = precio;
		this.peso = peso;
		this.categorias = new ArrayList<>();
	}

	@Override
	public double getPeso() {
		return peso;
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	public ArrayList<String> getCategorias() {
		return new ArrayList<String>(categorias);
	}

	@Override
	public int cantidadProductos() {
		return 1;
	}

	@Override
	public ArrayList<ElementoAbstracto> buscar(Criterio c) {
		ArrayList<ElementoAbstracto> aux = new ArrayList<>();
		if(c.cumple(this)){
			aux.add(this);
		}
		return aux;
	}

	@Override
	public ElementoAbstracto copia(Criterio c) {
        if (c.cumple(this)) {
            Simple copia = new Simple(this.getNombre(), this.precio, this.peso);
            for (String cat: categorias)
                copia.agregarCategoria(cat);
            return copia;
        }
        return null;
    }
	
    public void agregarCategoria(String cat){
        if (!categorias.contains(cat))
            categorias.add(cat);
    }

	@Override
	public Simple productoPesoBajo() {
		return this;
	}
	
	

}
