package parcial;

import java.util.ArrayList;

import parcial.ElementoHabitantes;
import parcial.Criterios.Criterio;


public class ElementoSimple extends ElementoHabitantes implements Comparable<ElementoSimple> {

	private double superficie;
	private int cantHabitantes;
	private int montoIngresos;
	
	@Override
	public int cantHabitantes() {
		return this.getCantHabitantes();
	}

	@Override
	public int totalIngresos() {
		return this.getMontoIngresos();
	}

	@Override
	public double superficieTotal() {
		return this.getSuperficie();
	}
	
	
	@Override
	public int compareTo(ElementoSimple elemSimple) {
		return this.getNombre() .compareTo(elemSimple.getNombre());
	}

	@Override
	public ArrayList<ElementoSimple> buscar(Criterio c) {
		ArrayList<ElementoSimple> aux = new ArrayList<ElementoSimple>();
		if(c.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}
	
	//////////////////////
	

	public double getSuperficie() {
		return superficie;
	}
	
	public int getCantHabitantes() {
		return cantHabitantes;
	}

	public int getMontoIngresos() {
		return montoIngresos;
	}
}
