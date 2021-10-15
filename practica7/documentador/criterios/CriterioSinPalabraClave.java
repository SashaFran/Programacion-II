package documentador.criterios;

import documentador.Documento;

public class CriterioSinPalabraClave extends Criterio {

	public CriterioSinPalabraClave() {
	}

	@Override
	public boolean cumple(Documento d1) {
		return d1.getPalabrasClave().isEmpty();
	}

}
