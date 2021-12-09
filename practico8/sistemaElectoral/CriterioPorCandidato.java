package sistemaElectoral;

public class CriterioPorCandidato extends Criterio {


	private Candidato candidato;

	public CriterioPorCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	@Override
	public boolean cumple(Voto v) {
		return v.votoA(candidato);
	}

}
