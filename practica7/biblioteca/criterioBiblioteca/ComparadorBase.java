package biblioteca.criterioBiblioteca;

import java.util.Comparator;

import biblioteca.Libro;

public abstract class ComparadorBase implements Comparator<Libro>{

	private ComparadorBase siguiente;
	
	public ComparadorBase(){
		siguiente = null;
	}
	
	public ComparadorBase(ComparadorBase siguiente){
		this.siguiente = siguiente; 
	}
	
	public abstract int comparador(Libro l, Libro l1); 
	
	public int compare(Libro l, Libro l1){
		int sol = comparador(l,l1); //sol = solucion
        if (sol==0){
            if (siguiente!=null)
                return siguiente.compare(l, l1);
            else
                return 0;
        }
        return sol;
		
	}
}
