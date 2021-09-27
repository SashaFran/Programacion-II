package Electrodomesticos;

public class Electrodomestico {
	String nombre, color;
	Double consumo;
	int precio, peso;
	
	public Electrodomestico(){
		color = "gris";
		consumo = 10.0;
		precio = 100;
		peso = 2;
	}
	
	public Electrodomestico(String nombre){
		this.nombre = nombre;
		color = "gris";
		consumo = 10.0;
		precio = 100;
		peso = 2;
	}
	
	public Electrodomestico(String nombre, String color, Double consumo, int precio, int peso){
		this.nombre = nombre;
		this.color = color;
		this.consumo = consumo;
		this.precio = precio;
		this.peso = peso;
	}
	
	public boolean bajoConsumo(){
		consumo = getConsumo();
		if (consumo < 45){
			return true;
		}else{
			return false;
		}
	}
	
	public int getBalance(){
		return precio/peso;
		//return getPrecio()/getPeso();
	}
	
	public boolean altaGama(){
		int balance = getBalance();
		if (balance > 3){
			return true;
		}else{
			return false;
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getConsumo() {
		return consumo;
	}

	public void setConsumo(Double consumo) {
		this.consumo = consumo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
