package vocabulario.criterios;

import vocabulario.Palabra;

public class CriterioMenosFrecuente implements Criterio{

	int frecuencia_max;
	
	public CriterioMenosFrecuente(int max){
		this.frecuencia_max = max;
	}
	@Override
	public boolean cumple(Palabra p) {
		return p.getCantidad()<frecuencia_max;
	}

}
