package clase05;

import java.time.LocalDate;

public class Archivo extends Elemento{
	
	private String extension;
	private LocalDate creacion;
	

	public Archivo(String extension, LocalDate creacion ,String nombre){
		super(nombre);
		this.extension = extension;
		this.creacion = creacion;
	}
	
	public String getExtension() {
		return extension;
	}
	
	public LocalDate getCreacion() {
		return creacion;
	}
	
	public double getTamaño(){
		
		return 1 ; 
	}

	@Override
	public int cantArchivos() {
		//Cuantos archivos son un archivo? 1.
		return 1;
	}
	
	
}
