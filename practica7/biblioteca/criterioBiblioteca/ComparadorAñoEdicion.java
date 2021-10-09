package biblioteca.criterioBiblioteca;

import biblioteca.Libro;

public class ComparadorA�oEdicion extends ComparadorBase{

	public ComparadorA�oEdicion(){
		
	}
	
	public ComparadorA�oEdicion(ComparadorBase siguiente){
		super(siguiente);
	}

	@Override
	public int comparador(Libro l, Libro l1) {
		return l.getA�oDePublicacion() - l1.getA�oDePublicacion();
	}

}
