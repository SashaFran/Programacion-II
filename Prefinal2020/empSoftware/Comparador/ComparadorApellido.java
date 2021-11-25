package empSoftware.Comparador;

import java.util.Comparator;

import empSoftware.ElementoEmp;

public class ComparadorApellido implements Comparator<ElementoEmp>{
	@Override
	public int compare(ElementoEmp e, ElementoEmp ee) {
		return e.getApellido().compareTo(ee.getApellido());
	}
	
}
