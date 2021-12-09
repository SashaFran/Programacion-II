package sistemaPaquetes;

public class CriterioCalle extends Criterio {

	private String calle;
	
	public CriterioCalle(String calle) {
		super();
		this.calle = calle;
	}

	@Override
	public boolean cumple(ElementoPaquete c) {
		return c.getDestinatario().getDireccion().equals(calle);
	}

}
