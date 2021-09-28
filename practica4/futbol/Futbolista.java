package futbol;

import java.time.LocalDate;


public class Futbolista extends Seleccion{

	char posicion; //z = zurdo, d = derecho.
	int cantGoles;
	
	public Futbolista(String nombre, String apellido, int pasaporte, LocalDate fechadNac, char estado,char posicion, int cantGoles){
		super(nombre, apellido, pasaporte, fechadNac, estado);
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
	
	public String toString(){
		return "Masajista: " +super.getNombre()+" "+super.getApellido()+"\nPasaporte: "+super.getPasaporte()+"\nEstado: "+super.getEstado()+"\nPosicion: "+this.getPosicion()+"\nCantidad de Goles: "+this.cantGoles+"\nEsta disponible: "+super.isDisponible();
	}
	
	
}
