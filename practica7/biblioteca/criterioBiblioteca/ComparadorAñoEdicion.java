package biblioteca.criterioBiblioteca;

import biblioteca.Libro;

public class ComparadorAñoEdicion extends ComparadorBase{

	public ComparadorAñoEdicion(){
		
	}
	
	public ComparadorAñoEdicion(ComparadorBase siguiente){
		super(siguiente);
	}

	@Override
	public int comparador(Libro l, Libro l1) {
		return l.getAñoDePublicacion() - l1.getAñoDePublicacion();
	}

}
