package biblioteca;

import java.time.LocalDate;

public class Libro{
	
	protected int isbn;
	protected String genero;
	protected LocalDate añoEdicion;
	protected String autor;
	
	
	public Libro(int id, String genero, String autor, LocalDate fecha){
		isbn = id;
		this.genero = genero;
		this.autor = autor;
		añoEdicion = fecha;
	}

	public int getIsbn() {
		return isbn;
	}

	public String getGenero() {
		return genero;
	}

	public LocalDate getAñoEdicion() {
		return añoEdicion;
	}
	
	public int getAñoDePublicacion(){
		return añoEdicion.getYear();
	}

	public String getAutor() {
		return autor;
	}
	
	public String toString(){
		return "Libro: " + this.getIsbn();
	}
	
	

}
