package parcial.Criterios;

import parcial.ElementoHabitantes;

public class CriterioDensidadMayor extends Criterio {


	private int densidad;
	
	
	public CriterioDensidadMayor(int densidad) {
		this.densidad = densidad;
	}

	@Override
	public boolean cumple(ElementoHabitantes elem) {
		return elem.densidad() > this.densidad;
	}
}
