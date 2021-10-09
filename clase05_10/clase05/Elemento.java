package clase05;

import java.time.LocalDate;

public abstract class Elemento {

	protected LocalDate creacion;
	protected String nombre;
	
	public Elemento(String nombre){
		this.nombre = nombre;
		this.creacion = LocalDate.now();
	}

	public abstract double getTamaño();
	public abstract int cantArchivos();

	public String getNombre() {
		return nombre;
	}
	
	
}
