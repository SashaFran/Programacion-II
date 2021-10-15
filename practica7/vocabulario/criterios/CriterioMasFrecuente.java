package vocabulario.criterios;

import vocabulario.Palabra;

public class CriterioMasFrecuente implements Criterio{
	int frecuencia_min;
	
	public CriterioMasFrecuente(int min){
		this.frecuencia_min = min;
	}
	@Override
	public boolean cumple(Palabra p) {
		return p.getCantidad()>=frecuencia_min;
	}

}
