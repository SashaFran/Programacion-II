package sujetos;

import java.time.LocalDate;
import java.util.ArrayList;

import filtros.Filtro;

public class Pasajero extends ElementoEgreso implements Comparable<Pasajero>{

	
	public Pasajero(String nombre, String destino, LocalDate fechaPartida, LocalDate fechaRegreso, double deuda) {
		super(nombre, destino, fechaPartida, fechaRegreso, deuda);
	}	

	@Override
	public double getDeuda() {
		return this.deuda;
	}

	@Override
	public int cantPasajeros() {
		return 1;
	}

	@Override
	public Pasajero mayorDeudor() {
		return this;
	}

	@Override
	public int compareTo(Pasajero o) {
		return (int) (this.getDeuda() - (o.getDeuda()));
	}

	@Override
	public ElementoEgreso copia() {
		return new Pasajero(this.getNombre(), this.getDestino(), this.getFechaPartida(), this.getFechaRegreso(), this.deuda);  
	}

	@Override
	public ArrayList<ElementoEgreso> losQueCumplen(Filtro f1) {
		ArrayList<ElementoEgreso> pasajerosQueCumplen = new ArrayList<>();
		
		if(f1.cumple(this)) {	//si cumplo la condicion
			pasajerosQueCumplen.add(this);	//me agrego a mi mismo a la lista
		}
		
		return pasajerosQueCumplen; //retorno la lista.
	}

	@Override
	public String toString() {
		return "Pasajero [Nombre: " + this.getNombre() + "deuda: " + deuda + "]";
	}
	
	
	
	
	
}
