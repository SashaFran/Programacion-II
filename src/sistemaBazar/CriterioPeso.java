package sistemaBazar;

public class CriterioPeso extends Criterio {

	private double pesoMin;
	
	
	public CriterioPeso(double pesoMin) {
		super();
		this.pesoMin = pesoMin;
	}


	@Override
	public boolean cumple(ElementoBazar e) {
		return e.getPeso() > pesoMin;
	}

}
