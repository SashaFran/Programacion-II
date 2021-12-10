package sistemaVestimentas;

import java.util.ArrayList;

public class Combo extends ElementoVestimenta{


	ArrayList<ElementoVestimenta> elementos;
	
	public Combo(String nombre) {
		super(nombre);
		this.elementos = new ArrayList<>();
	}

	public void addCombo(ElementoVestimenta e){
		elementos.add(e);
	}
	
	@Override
	public ArrayList<ElementoVestimenta> listado(Criterio c) {
		ArrayList<ElementoVestimenta> aux = new ArrayList<>();
		for (ElementoVestimenta e: elementos)
			if(c.cumple(e))
				aux.addAll(e.listado(c));
		return aux;
	}

	@Override
	public String getColor() {
		String color = null;
		for(ElementoVestimenta e: elementos){
			String repetido = e.getColor();
			if(color == repetido){
				color = repetido;
				System.out.println("Color repetido combo: " + color);
			}
		}
		return color;
	}

	@Override
	public String getCategoria() {
		String categoria = null;
		for(ElementoVestimenta e: elementos)
			categoria = e.getCategoria();
		return categoria;
	}

	@Override
	public String getEstacion() {
		String estacion = null;
		for (ElementoVestimenta e: elementos)
			estacion = e.getEstacion();
		System.out.println("Estacion 2: " + estacion);
		return estacion;
	}

	@Override
	public String toString() {
		return "Combo [elementos=" + elementos + "]";
	}

	@Override
	public ElementoVestimenta copia() {
		Combo bb = new Combo(this.getNombre());
		for(ElementoVestimenta e: elementos){
			ElementoVestimenta copia = e.copia();
			if(copia!= null)
				bb.addCombo(copia);
		}
		if(bb.tieneElementos())
			return bb;
		else
			return null;
	}

	private boolean tieneElementos() {	
		return !elementos.isEmpty();
	}



	

	
	
	
}
