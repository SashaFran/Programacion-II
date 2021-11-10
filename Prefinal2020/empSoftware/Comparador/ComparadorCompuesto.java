package empSoftware.Comparador;

import java.util.Comparator;

import empSoftware.ElementoEmp;

public class ComparadorCompuesto implements Comparator<ElementoEmp>{

	private Comparator<ElementoEmp> ee;
	private Comparator<ElementoEmp> e1;
	
	public ComparadorCompuesto(Comparator<ElementoEmp> ee, Comparator<ElementoEmp> e1){
		this.e1 = e1;
		this.ee = ee;
	}
	
	@Override
	public int compare(ElementoEmp o1, ElementoEmp o2) {
		int r1 = ee.compare(o1, o2);
		if (r1 == 0) {
			return e1.compare(o1, o2);
		}
		return r1;
	}



}
