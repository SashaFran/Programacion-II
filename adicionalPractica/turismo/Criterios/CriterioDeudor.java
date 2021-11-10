package turismo.Criterios;

import turismo.ElementoContingente;

public class CriterioDeudor extends Criterio {

	private double deuda;

	public CriterioDeudor(double deuda) {
		super();
		this.deuda = deuda;
	}

	@Override
	public boolean cumple(ElementoContingente e) {

		return e.getDeuda() > deuda;
	}

}
