package sistemaElectoral;

import java.util.Comparator;

public class ComparadorPorPartidoPolitico implements Comparator<Candidato> {
	
	
	public ComparadorPorPartidoPolitico() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Candidato c1, Candidato c2) {
		return c1.getPartidoPolitcio().compareTo(c2.getPartidoPolitcio());
	}

}
