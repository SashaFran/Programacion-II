package biblioteca.criterioBiblioteca;

import java.util.Comparator;

import biblioteca.Libro;

//public class ComparadorAutor extends ComparadorBase{

public class ComparadorAutor implements Comparator<Libro>{
	public ComparadorAutor(){
			
		}

	/*public ComparadorAutor(ComparadorBase siguiente){
		super(siguiente);
	}*/
	
	@Override
	public int compare(Libro l, Libro l1) {
		return l.getAutor().compareTo(l1.getAutor());
	}

}
