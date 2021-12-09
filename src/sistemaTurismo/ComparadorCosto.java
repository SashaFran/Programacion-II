package sistemaTurismo;

import java.util.Comparator;

public class ComparadorCosto implements Comparator<ElementoTurismo> {

	@Override
	public int compare(ElementoTurismo o1, ElementoTurismo o2) {
		return (int) (o1.getCosto() - o2.getCosto());
	}

}
