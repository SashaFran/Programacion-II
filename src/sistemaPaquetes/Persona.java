package sistemaPaquetes;

public class Persona {

	private String nombre;
	private String ciudad;
	private String direccion;

	public Persona(String nombre, String ciudad, String direccion) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getDireccion() {
		return direccion;
	}
	
	
	
}
