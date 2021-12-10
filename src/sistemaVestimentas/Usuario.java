package sistemaVestimentas;

public class Usuario {

	private String nombre, color, estacion;
	
	
	public Usuario(String nombre, String color, String estacion) {
		this.nombre = nombre;
		this.color = color;
		this.estacion = estacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getColor() {
		return color;
	}

	public String getEstacion() {
		return estacion;
	}
	
	
	
}
