package sistemaElectoral;

import java.util.ArrayList;

import sistemaElectoral.criterios.*;

public abstract class ElementoElectoral {

	public abstract String getNombre();
	protected abstract int contarTotalidadVotos();
	public abstract double porcentajeporCriterio(Criterio criterio);

	protected abstract int contarVotoxCriterio(Criterio criterio);
	
	public abstract ArrayList<Candidato>listaCandidatos();
	
}
