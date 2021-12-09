package sistemaTurismo;

import java.util.Comparator;

public class ComparadorCantPasajeros implements Comparator<ElementoTurismo> {

	@Override
	public int compare(ElementoTurismo o1, ElementoTurismo o2) {
		return o1.getCantPasajeros() - o2.getCantPasajeros();
	}

}
