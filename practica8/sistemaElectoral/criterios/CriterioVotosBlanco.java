package sistemaElectoral.criterios;

import sistemaElectoral.Voto;

public class CriterioVotosBlanco extends Criterio {

	@Override
	public boolean cumple(Voto voto) {
		return (voto.getCandidato()==null);
	}

}
