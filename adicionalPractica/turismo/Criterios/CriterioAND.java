package turismo.Criterios;

import turismo.ElementoContingente;

public class CriterioAND extends Criterio {

	Criterio c1;
	Criterio c2;

	public CriterioAND(Criterio c1, Criterio c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(ElementoContingente e) {
		// TODO Auto-generated method stub
		return c1.cumple(e) && c2.cumple(e);
	}

}
