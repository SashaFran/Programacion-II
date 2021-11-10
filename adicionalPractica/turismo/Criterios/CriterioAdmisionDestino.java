package turismo.Criterios;

import turismo.ElementoContingente;

public class CriterioAdmisionDestino extends Criterio {

	private String destino;

	public CriterioAdmisionDestino(String destino) {
		super();
		this.destino = destino;
	}

	@Override
	public boolean cumple(ElementoContingente e) {
		return e.getDestino().equals(destino);
	}

}
