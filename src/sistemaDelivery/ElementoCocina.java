package sistemaDelivery;

import java.util.ArrayList;

public abstract class ElementoCocina {

	private String nombre;
	
	public ElementoCocina(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}


	public abstract double getCosto();
	public abstract ArrayList<ElementoCocina> getIngrediente();
}
