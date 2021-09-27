package futbol;


public class Futbolista extends Seleccion{

	char posicion; //z = zurdo, d = derecho.
	int cantGoles;
	
	public Futbolista(char posicion, int cantGoles){
		super();
		this.posicion = posicion;
		this.cantGoles = cantGoles;
	}

	public char getPosicion() {
		return posicion;
	}

	public void setPosicion(char posicion) {
		this.posicion = posicion;
	}

	public int getCantGoles() {
		return cantGoles;
	}

	public void setCantGoles(int cantGoles) {
		this.cantGoles = cantGoles;
	}
	
	
}
