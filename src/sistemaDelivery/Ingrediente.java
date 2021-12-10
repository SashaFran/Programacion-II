package sistemaDelivery;

import java.util.ArrayList;


public class Ingrediente extends ElementoCocina {

	private double costo;
	
	public Ingrediente(String nombre, double costo) {
		super(nombre);
		this.costo = costo;
	}

	@Override
	public double getCosto() {
		return costo;
	}

	@Override
	public ArrayList<ElementoCocina> getIngrediente() {
		ArrayList<ElementoCocina> aux = new ArrayList<>();
		aux.add(this);
		return aux;
	}

	@Override
	public String toString() {
		return "\nIngrediente: " + this.getNombre() +"\nCosto: "+ costo;
	}
	
	
	


	
}
