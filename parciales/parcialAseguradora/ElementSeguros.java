package parcialAseguradora;

import java.util.ArrayList;


import parcialAseguradora.criterios.Criterio;

public abstract class ElementSeguros {
	private String nombre;
	
	public ElementSeguros(String g) {
		nombre=g;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public abstract ArrayList<SeguroSimple>ListaSegurosCriterio(Criterio c);
	public abstract double getPrecio();
}
