package sistemaBazar;

public class CriterioPrecio extends Criterio {

	private double precio;
	
	public CriterioPrecio(double precio) {
		super();
		this.precio = precio;
	}

	@Override
	public boolean cumple(ElementoBazar e) {
		return e.getPrecio() == precio;
	}

}
