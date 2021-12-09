package sistemaElectoral;

import java.util.ArrayList;
import java.util.Collections;

public class SistemaElectoral {

	private ArrayList<Candidato> candidatos;
	private ArrayList<ElementoVotante> entidades;
	
	public SistemaElectoral() {
		this.candidatos = new ArrayList<>();
		this.entidades = new ArrayList<>();
	}

	public void addCandidato(Candidato c) {
		this.candidatos.add(c);
	}
	
	public void addEntidad(ElementoVotante e) {
		this.entidades.add(e);
	}
	
	public ArrayList<Candidato> getTotalCandidatosPresentes(){
		ArrayList<Candidato> resultado = new ArrayList<Candidato>(candidatos);
		//Si siempre se va a ordenar igual compareTo de Comparable:
		Collections.sort(resultado);
		
		//Si puede que cambie el orden, que no es el caso, se usa, compare de Comparable:
		//Collections.sort(resultado, Comparator<Candidato>);
		
		return resultado;
		
		
	}
}
