package turismo.criterios;

import turismo.ElementosTurismo;

public class CriterioCostoMayor extends Criterio{

	private double precioLimite;
	
	public CriterioCostoMayor(Double p){
		this.precioLimite = p;
	}
	@Override
	public boolean cumple(ElementosTurismo e) {
		return e.getCosto() > this.precioLimite;
	}

	
}
