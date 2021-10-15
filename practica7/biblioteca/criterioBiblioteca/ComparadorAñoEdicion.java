package biblioteca.criterioBiblioteca;

import java.util.Comparator;

import biblioteca.Libro;

//public class ComparadorAñoEdicion extends ComparadorBase{

public class ComparadorAñoEdicion implements Comparator<Libro>{
	
	
	/*public ComparadorAñoEdicion(ComparadorBase siguiente){
		super(siguiente);
	}*/

	@Override
	public int compare(Libro l, Libro l1) {
		return l.getAñoDePublicacion() - l1.getAñoDePublicacion();
	}

}
