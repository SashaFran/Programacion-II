package empSoftware.Comparador;

import java.util.Comparator;
import empSoftware.ElementoEmp;

public class ComparadorNombre implements Comparator<ElementoEmp>{

	@Override
	public int compare(ElementoEmp e, ElementoEmp ee) {
		return e.getNombre().compareTo(ee.getNombre());
	}
	
}
