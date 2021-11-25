package parcial;

import java.util.ArrayList;
import java.util.Collections;

import parcial.ElementoHabitantes;
import parcial.Criterios.Criterio;

public class ElementoCompuesto extends ElementoHabitantes {
	
	private ArrayList<ElementoHabitantes> hijos;

	@Override
	public int cantHabitantes() {
		int total = 0;
		for(ElementoHabitantes el:hijos) {
			total += el.cantHabitantes();
		}
		return total;
	}

	@Override
	public int totalIngresos() {
		int total = 0;
		for(ElementoHabitantes el:hijos) {
			total += el.totalIngresos();
		}
		return total;
	}

	@Override
	public double superficieTotal() {
		double total = 0;
		for(ElementoHabitantes el:hijos) {
			total += el.superficieTotal();
		}
		return total;
	}

	@Override
	public ArrayList<ElementoSimple> buscar(Criterio c) {
		ArrayList<ElementoSimple> aux = new ArrayList<ElementoSimple>();
		for(ElementoHabitantes el:hijos) {
			aux.addAll(el.buscar(c));
		}
		Collections.sort(aux);
		return aux;
	}
}
