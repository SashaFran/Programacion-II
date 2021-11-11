package turismo.Comparadores;

import java.util.Comparator;

import turismo.Alumno;

public class ComparadorDeudas implements Comparator<Alumno>{

	@Override
	public int compare(Alumno a0, Alumno a1) {
		return (int) (a0.getDeuda() - a1.getDeuda());
	}



	
}
