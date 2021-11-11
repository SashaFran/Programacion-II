package sujetos;

import java.time.LocalDate;
import java.util.ArrayList;

import filtros.Filtro;

public abstract class ElementoEgreso {
	
	private String nombre, destino;
	private LocalDate fechaPartida;
	private LocalDate fechaRegreso;
	protected double deuda;
	
	public ElementoEgreso(String nombre, String destino, LocalDate fechaPartida, LocalDate fechaRegreso, double deuda) {
		this.nombre = nombre;
		this.destino = destino;
		this.fechaPartida = fechaPartida;
		this.fechaRegreso = fechaRegreso;
		this.deuda = deuda;
	}

	public abstract ArrayList<ElementoEgreso> losQueCumplen(Filtro f1);
	
	public abstract int cantPasajeros();
	
	public abstract ElementoEgreso copia();
	
	public abstract Pasajero mayorDeudor();

	public abstract double getDeuda();
	
	public  String getNombre()
	{return this.nombre;}

	public String getDestino() {
		return this.destino;
	}

	public LocalDate getFechaPartida() {
		return this.fechaPartida;
	}

	public LocalDate getFechaRegreso() {
		return this.fechaRegreso;
	}

}
