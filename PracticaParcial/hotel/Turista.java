package hotel;

public class Turista {

	private String nombre, ciudadOrigen;
	private int edad;
	
	
	public Turista(String nombre, String ciudadOrigen, int edad) {
		this.nombre = nombre;
		this.ciudadOrigen = ciudadOrigen;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public String getCiudadOrigen() {
		return ciudadOrigen;
	}


	public int getEdad() {
		return edad;
	}
	
	
	
}
