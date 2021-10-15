package vocabulario.criterios;

import java.util.Comparator;
import vocabulario.Palabra;

public class ComparatorFrecuencia implements Comparator<Palabra>{

	@Override
	public int compare(Palabra p1, Palabra p2) {
		return p1.getCantidad()-p2.getCantidad();
	}

}
