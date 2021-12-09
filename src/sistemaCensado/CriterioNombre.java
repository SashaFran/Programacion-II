package sistemaCensado;

public class CriterioNombre extends Criterio {

	private String nombre;
	
	public CriterioNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean cumple(Comarca c) {
		return c.getNombre().equals(nombre);
	}

}
