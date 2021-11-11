package parcial.Criterios;

import parcial.ElementoHabitantes;

public class CriterioHabitantesMayor extends Criterio {

	private int cant;
	
	
	public CriterioHabitantesMayor(int cant) {
		this.cant = cant;
	}

	@Override
	public boolean cumple(ElementoHabitantes elem) {
		return elem.cantHabitantes() > this.cant;
	}

}
