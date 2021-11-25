package hotel;

import hotel.Criterios.Criterio;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoHotel {

	public abstract int getCantCamas();
	public abstract ArrayList<Habitacion> getHabitaciones(Turista t);
	public abstract ArrayList<Habitacion> cumple(Criterio c);
	
	
	public ArrayList<Habitacion> cumplen(Criterio c, Comparator<Habitacion> e){
		return null;
		
	}
}
