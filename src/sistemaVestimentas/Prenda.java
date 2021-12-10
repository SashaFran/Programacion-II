package sistemaVestimentas;

import java.util.ArrayList;

public class Prenda extends ElementoVestimenta{

	private String categoria, color, estacion;

	
	public Prenda(String nombre, String categoria, String color, String estacion) {
		super(nombre);
		this.categoria = categoria;
		this.color = color;
		this.estacion = estacion;
	}

	@Override
	public ArrayList<ElementoVestimenta> listado(Criterio c) {
		ArrayList<ElementoVestimenta> aux = new ArrayList<>();
		if(c.cumple(this))
			aux.add(this);
		return aux;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public String getCategoria() {
		return categoria;
	}
	public String getEstacion() {
		return estacion;
	}

	@Override
	public String toString() {
		return 
				 "\nCategoria: " + categoria 
				+ "\nColor: " + color
				+ "\nEstacion: " + estacion; 
	}

	@Override
	public ElementoVestimenta copia() {
		Prenda pp = new Prenda(this.getNombre(), categoria, color, estacion);
		
		return pp;
	}
	

	
	
	
	
}
