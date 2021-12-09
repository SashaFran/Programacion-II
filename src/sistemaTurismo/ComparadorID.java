package sistemaTurismo;

import java.util.Comparator;

public class ComparadorID implements Comparator<ElementoTurismo> {

	@Override
	public int compare(ElementoTurismo o1, ElementoTurismo o2) {
		return o1.getIdentificador() - o2.getIdentificador();
	}

}
