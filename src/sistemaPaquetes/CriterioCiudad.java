package sistemaPaquetes;

public class CriterioCiudad extends Criterio {

	private String ciudad;
	
	public CriterioCiudad(String ciudad) {
		super();
		this.ciudad = ciudad;
	}

	@Override
	public boolean cumple(ElementoPaquete c) {
		return c.getDestinatario().getCiudad().equals(ciudad);
	}

}
