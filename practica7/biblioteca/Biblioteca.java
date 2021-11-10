package biblioteca;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Biblioteca {
	private String nombre;
	private ArrayList<Libro>libros;
	
	
	
	public Biblioteca(String nombre) {
		this.nombre=nombre;
		libros = new ArrayList<>();
	}
	
	
	public void addLibro(Libro l) {
		if (!libros.contains(l)) {
			libros.add(l);
		}
	}

	public ArrayList<Libro> mostrarLibros_porDefecto() {
		@SuppressWarnings("unchecked")
		ArrayList<Libro> copia= (ArrayList<Libro>) libros.clone();
		Collections.sort(copia);
		return copia;
	}
	
	//modificar el ordenar
	public ArrayList<Libro> ordenarLibros_porXCriterio(Comparator<Libro> Comparador ) {
		@SuppressWarnings("unchecked")
		ArrayList<Libro> copia=(ArrayList<Libro>) libros.clone();
		Collections.sort(copia,Comparador);
		return copia;
	}


	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", libros=" + libros + "]";
	}
	
}
