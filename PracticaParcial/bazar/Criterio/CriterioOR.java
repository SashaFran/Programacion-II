package bazar.Criterio;

import bazar.ElementoAbstracto;

public class CriterioOR extends Criterio {

	private Criterio c1, c2;
	
	public CriterioOR(Criterio c1, Criterio c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(ElementoAbstracto e) {
		return c1.cumple(e)||c2.cumple(e);
	}

}
