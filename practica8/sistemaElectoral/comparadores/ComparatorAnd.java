package sistemaElectoral.comparadores;

import java.util.Comparator;

import sistemaElectoral.Candidato;

public class ComparatorAnd implements Comparator<Candidato>{

	private Comparator<Candidato> c1;
	private Comparator<Candidato> c2;
	
	public ComparatorAnd(Comparator<Candidato> c1, Comparator<Candidato> c2) {
		this.c1=c1;
		this.c2=c2;
	}
	@Override
	public int compare(Candidato o1, Candidato o2) {
		int resultado= c1.compare(o1, o2);
		if (resultado==0) {
			resultado= c2.compare(o1, o2);
		}
		return resultado;
	}

}
