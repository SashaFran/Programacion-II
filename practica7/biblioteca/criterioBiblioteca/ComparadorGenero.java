package biblioteca.criterioBiblioteca;

import biblioteca.Libro;

public class ComparadorGenero extends ComparadorBase{

	public ComparadorGenero(){
			
	}
	
	public ComparadorGenero(ComparadorBase siguiente){
		super(siguiente);
	}

	@Override
	public int comparador(Libro l, Libro l1) {
		return l.getGenero().compareTo(l1.getGenero());
	}

}
