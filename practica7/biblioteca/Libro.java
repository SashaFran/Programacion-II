package biblioteca;

import java.time.LocalDate;

public class Libro{
	
	protected int isbn;
	protected String genero;
	protected LocalDate a�oEdicion;
	protected String autor;
	
	
	public Libro(int id, String genero, String autor, LocalDate fecha){
		isbn = id;
		this.genero = genero;
		this.autor = autor;
		a�oEdicion = fecha;
	}

	public int getIsbn() {
		return isbn;
	}

	public String getGenero() {
		return genero;
	}

	public LocalDate getA�oEdicion() {
		return a�oEdicion;
	}
	
	public int getA�oDePublicacion(){
		return a�oEdicion.getYear();
	}

	public String getAutor() {
		return autor;
	}
	
	public String toString(){
		return "Libro: " + this.getIsbn();
	}
	
	

}
