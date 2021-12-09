package sistemaTurismo;

public class CriterioNombre extends Criterio {

	private String nombre;
	
	public CriterioNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean cumple(ElementoTurismo e) {
		return e.getNombre().contains(nombre);
	}

}
