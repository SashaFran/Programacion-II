package biblioteca.criterioBiblioteca;

import biblioteca.Libro;

//por defecto
public class ComparadorID extends ComparadorBase{

	public ComparadorID(){
			
	}
	
	public ComparadorID(ComparadorBase siguiente){
		super(siguiente);
	}

	@Override
	public int comparador(Libro l, Libro l1) {
		return l.getIsbn()-l1.getIsbn();
	}

	
}
