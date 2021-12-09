package sistemaTurismo;

import java.util.Comparator;


public class ComparadorOrigen implements Comparator<ElementoTurismo> {

	@Override
	public int compare(ElementoTurismo o1, ElementoTurismo o2) {
		return o1.getOrigen().compareTo(o2.getOrigen());
	}

}
