package sistemaTurismo;

import java.util.Comparator;

public class ComparadorAND implements Comparator<ElementoTurismo> {
	
	private Comparator<ElementoTurismo> c1;
	private Comparator<ElementoTurismo> c2;
	
	
	public ComparadorAND(Comparator<ElementoTurismo> c1,
			Comparator<ElementoTurismo> c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}


	@Override
	public int compare(ElementoTurismo o1, ElementoTurismo o2) {
		int aux = c1.compare(o1, o2);
		if (aux == 0){
			aux = c2.compare(o1, o2);
		}
		return aux;
	}


}
