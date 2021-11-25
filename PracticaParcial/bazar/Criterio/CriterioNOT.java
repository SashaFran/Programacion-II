package bazar.Criterio;

import bazar.ElementoAbstracto;

public class CriterioNOT extends Criterio {

	private Criterio c;
	
	public CriterioNOT(Criterio c) {
		this.c = c;
	}

	@Override
	public boolean cumple(ElementoAbstracto e) {
		return !c.cumple(e);
	}

}
