package biblioteca.criterioBiblioteca;

import biblioteca.Libro;

public class ComparadorAutor extends ComparadorBase{

	public ComparadorAutor(){
			
		}

	public ComparadorAutor(ComparadorBase siguiente){
		super(siguiente);
	}
	
	@Override
	public int comparador(Libro l, Libro l1) {
		return l.getAutor().compareTo(l1.getAutor());
	}

}
