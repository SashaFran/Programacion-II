package hotel;

import hotel.Criterios.Criterio;

import java.time.LocalDate;
import java.util.ArrayList;

import sis.Cama;

public class Habitacion extends ElementoHotel {

	private int metroCuadrados, cantCamas;
	private LocalDate ultimaFecha;
	private ArrayList<String> comodidades;
	private Turista turista;
	private Criterio criterio;
	
	
	public Habitacion(int metroCuadrados, int cantCamas ,LocalDate ultimaFecha) {
		this.metroCuadrados = metroCuadrados;
		this.ultimaFecha = ultimaFecha;
		this.cantCamas = cantCamas;
		this.comodidades = new ArrayList<>();
		this.turista = turista;
		this.criterio = criterio;
	}

	public int getMetroCuadrados() {
		return metroCuadrados;
	}


	public int getCantCamas() {
		return cantCamas;
	}


	public LocalDate getUltimaFecha() {
		return ultimaFecha;
	}


	public ArrayList<String> getComodidades() {
		return new ArrayList<String>(comodidades);
	}


	@Override
	public ArrayList<Habitacion> getHabitaciones(Turista t) {
		ArrayList<Habitacion> habitacionLibre = new ArrayList<>();
		if(this.estaLibre() && this.criterio.cumple(t)){
			habitacionLibre.add(this);
		}
		return habitacionLibre;
	}
	
	@Override
	public ArrayList<Habitacion> cumple(Criterio c) {
		ArrayList<Habitacion> temp = new ArrayList<>();
		if(c.cumple(this)){
			temp.add(this);
			
		}
		return temp;
	}
	


	
	
}
