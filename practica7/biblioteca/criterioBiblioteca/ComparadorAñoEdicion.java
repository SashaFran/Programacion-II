package biblioteca.criterioBiblioteca;

import java.util.Comparator;

import biblioteca.Libro;

//public class ComparadorA�oEdicion extends ComparadorBase{

public class ComparadorA�oEdicion implements Comparator<Libro>{
	
	
	/*public ComparadorA�oEdicion(ComparadorBase siguiente){
		super(siguiente);
	}*/

	@Override
	public int compare(Libro l, Libro l1) {
		return l.getA�oDePublicacion() - l1.getA�oDePublicacion();
	}

}
