package sistemaElectoral.criterios;

import sistemaElectoral.Candidato;
import sistemaElectoral.Voto;

public class CriterioCandidato extends Criterio{
	
	private Candidato c;
	
	public CriterioCandidato(Candidato cc1) {
		c=cc1;
	}

	@Override
	public boolean cumple(Voto voto) {
		 if (voto.getCandidato()!=null) {
			 return(voto.getCandidato().equals(c));
		 }
		 return false;
	}
}