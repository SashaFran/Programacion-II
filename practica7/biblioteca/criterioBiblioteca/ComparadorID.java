package biblioteca.criterioBiblioteca;

import java.util.Comparator;

import biblioteca.Libro;

//por defecto
public class ComparadorID implements Comparator<Libro>{

	@Override
	public int compare(Libro l, Libro l1) {
		return l.getIsbn()-l1.getIsbn();
	}

	
}
