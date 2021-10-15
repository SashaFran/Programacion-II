package biblioteca.criterioBiblioteca;

import java.util.Comparator;

import biblioteca.Libro;

//public class ComparadorGenero extends ComparadorBase{

	public class ComparadorGenero implements Comparator<Libro>{


	@Override
	public int compare(Libro l, Libro l1) {
		return l.getGenero().compareTo(l1.getGenero());
	}

}
