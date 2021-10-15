package biblioteca;

import java.time.LocalDate;
import java.util.Comparator;

import biblioteca.criterioBiblioteca.ComparadorAutor;


public class Usuario {

	public static void main(String[] args){
		
		Biblioteca bb = new Biblioteca("Tandil");
		
		
		Libro ll = new Libro(111,"Libro 1","Terror","AA",LocalDate.of(2000, 07, 01));
		Libro l1 = new Libro(112, "Libro 2","Accion", "ZB", LocalDate.of(2001, 05, 20));
		Libro l2 = new Libro(113, "Libro 3","Aventura", "XC", LocalDate.of(2003, 01, 20));
		Libro l3 = new Libro(114, "Libro 4","Drama", "BB", LocalDate.of(2011, 12, 24));

		Comparator<Libro> comparatorAutor = new ComparadorAutor();
		bb.addLibro(ll);
		bb.addLibro(l1);
		bb.addLibro(l2);
		bb.addLibro(l3);
		
		System.out.println("\n"+bb.ordenarLibros_porXCriterio(comparatorAutor)+"\n");
		
		/*System.out.println("Comparador por año");
		Collections.sort(libros, new ComparadorAñoEdicion());
		System.out.println(libros);
		
		System.out.println("Comparador por Autor:");
		Collections.sort(libros, new ComparadorAutor());
		System.out.println(libros);

		System.out.println("Comparador por Genero");
		Collections.sort(libros, new ComparadorGenero());
		System.out.println(libros);
		
		System.out.println("Comparador por ID");
		Collections.sort(libros, new ComparadorID());
		System.out.println(libros);*/
	}
}