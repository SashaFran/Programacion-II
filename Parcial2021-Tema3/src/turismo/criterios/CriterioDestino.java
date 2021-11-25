package turismo.criterios;

import turismo.ElementosTurismo;

public class CriterioDestino extends Criterio {

	private String destino;
	
	public CriterioDestino(String d){
		this.destino = d;
	}
	
	public String getDestino() {
		return destino;
	}

	@Override
	public boolean cumple(ElementosTurismo e) {
		return e.getDestino().equals(destino);
	}

}
