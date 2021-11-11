package parcial.Criterios;

import parcial.ElementoHabitantes;

public class CriterioNombre extends Criterio {

	private String nombre;
	
	
	public CriterioNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean cumple(ElementoHabitantes elem) {
		return elem.getNombre().equals(nombre);
	}

}
