package sistemaPaquetes;

public class CriterioPeso extends Criterio{

	private Double pesoLimite;
	
	
	public CriterioPeso(Double peso) {
		super();
		this.pesoLimite = peso;
	}


	@Override
	public boolean cumple(ElementoPaquete c) {
		return c.getPeso() < this.pesoLimite;
	}

}
