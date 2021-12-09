package sistemaFabrica;



public class Mueble{

	private String nombre;
	private double costo;
	private String material, color;
	
	
	public Mueble(String nombre, double costo, String material, String color) {
		super();
		this.nombre = nombre;
		this.costo = costo;
		this.material = material;
		this.color = color;
	}


	public String getNombre() {
		return nombre;
	}

	public double getCosto() {
		return costo;
	}

	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return color;
	}


	@Override
	public String toString() {
		return "\nNombre: " + nombre + "\ncosto: " + costo + "\nmaterial: "+ material + "\ncolor: " + color;
	}
	
	
	
	

}
