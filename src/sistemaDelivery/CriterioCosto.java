package sistemaDelivery;

public class CriterioCosto extends Criterio {

	private double costoMin;
	
	public CriterioCosto(double costoMin) {
		super();
		this.costoMin = costoMin;
	}

	@Override
	public boolean acepta(Receta r) {
		return r.getCosto() < costoMin;
	}

}
