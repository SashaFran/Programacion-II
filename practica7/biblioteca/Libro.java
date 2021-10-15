package biblioteca;

import java.time.LocalDate;

public class Libro implements Comparable<Libro>{
	
	protected int isbn;
	protected String genero;
	protected LocalDate añoEdicion;
	protected String autor;
	protected String nombre;
	
	
	public Libro(int id, String nombre,String genero, String autor, LocalDate fecha){
		isbn = id;
		this.nombre = nombre;
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
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean equals(Object o) {
		try {
			Libro aux= (Libro)o;
			return this.getNombre().equals(aux.getNombre());
		}catch(Exception exc) {
			return false;
		}
	
	}

	@Override
	public int compareTo(Libro o) {
		if (this.getIsbn()> o.getIsbn())
			return 1000;
		else if (this.getIsbn() < o.getIsbn()) {
			return -5000;
			
			}else return 0;
		}

	@Override
	public String toString() {
		return "Libro \nid= " + this.getIsbn() + ", \nNombre= " + nombre + ", \nAutor=" + autor + ", \nAño de publicacion= " + this.getAñoDePublicacion()
				+ ", \nGenero=" + this.getGenero();
	}
	
	
}
	
