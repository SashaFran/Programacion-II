package turismo.criterios;

import turismo.ElementosTurismo;

public class CriterioNOT extends Criterio{

	private Criterio c;
	
	public CriterioNOT(Criterio c){
		this.c = c;
	}

	@Override
	public boolean cumple(ElementosTurismo e) {
		return !c.cumple(e);
	}


}
