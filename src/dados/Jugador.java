package dados;

public class Jugador {

	private int puntos;
	private String nombre;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void sumarPunto() {
		this.puntos ++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int tirarDados(Dado d1, Dado d2) {
		// DELEGANDO RESPONSABILIDADES
		return d1.tirar() + d2.tirar();
	}
	

	
	public int tirarDados(cubilete cub) {
		// DELEGANDO RESPONSABILIDADES
		return cub.tirar();
	}
	
	
}
