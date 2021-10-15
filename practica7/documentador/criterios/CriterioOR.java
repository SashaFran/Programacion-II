package documentador.criterios;

import documentador.Documento;

public class CriterioOR extends Criterio {

	private Criterio c1, c2;
	
	public CriterioOR(Criterio c1, Criterio c2){
		this.c1 = c1;
		this.c2 = c2
				;
	}
	@Override
	public boolean cumple(Documento d1) {
		return c1.cumple(d1) || c2.cumple(d1);
	}

}
