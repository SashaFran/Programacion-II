package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import biblioteca.criterioBiblioteca.ComparadorAutor;
import biblioteca.criterioBiblioteca.ComparadorAñoEdicion;
//import biblioteca.criterioBiblioteca.ComparadorBase;
import biblioteca.criterioBiblioteca.ComparadorGenero;
import biblioteca.criterioBiblioteca.ComparadorID;


public class Biblioteca {

	public static void main(String[] args){
		
		ArrayList<Libro> libros = new ArrayList<>();
		Libro ll = new Libro(111,"Terror","AA",LocalDate.of(2000, 07, 01));
		Libro l1 = new Libro(112, "Accion", "ZB", LocalDate.of(2001, 05, 20));
		Libro l2 = new Libro(113, "Aventura", "XC", LocalDate.of(2003, 01, 20));
		Libro l3 = new Libro(114, "Drama", "BB", LocalDate.of(2011, 12, 24));

		libros.add(ll);
		libros.add(l1);
		libros.add(l2);
		libros.add(l3);
		
		System.out.println("Comparador por año");
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
		System.out.println(libros);
		
		
		/*ComparadorBase comp1 = new ComparadorAutor();
		ComparadorBase comp2 = new ComparadorAñoEdicion();
		ComparadorBase comp3 = new ComparadorGenero();
		ComparadorBase comp4 = new ComparadorID();
		
		System.out.println("Por autor: "+comp1.compare(ll, l1)); //-25 distancia entre la 'a' y la 'z'
		System.out.println("Por Año de Publicado"+comp2.comparador(ll, l1)); //-1
		*/
	}
	
	
}
