package sistemaPaquetes;

public class CriterioNombre extends Criterio {

	private String nombre;
	
	public CriterioNombre(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public boolean cumple(ElementoPaquete c) {
		return c.getDestinatario().getNombre().equals(nombre);
	}

}
