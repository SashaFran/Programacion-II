package sistemaElectoral;

public class CriterioPorVotoEnBlanco extends Criterio {

	public CriterioPorVotoEnBlanco() {
		
	}

	//Podr�a haber usado el CriterioPorCandidato
	@Override
	public boolean cumple(Voto v) {
		return v.votoEnBlanco();
	}


}
