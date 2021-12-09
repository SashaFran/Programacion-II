package sistemaTurismo;

public class CriterioCosto extends Criterio {

	private int costoMin;
	
	public CriterioCosto(int costoMin) {
		this.costoMin = costoMin;
	}
	
	@Override
	public boolean cumple(ElementoTurismo e) {
		return e.getCosto() > costoMin;
	}

}
