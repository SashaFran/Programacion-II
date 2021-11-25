package hotel;

import hotel.Criterios.Criterio;

import java.util.ArrayList;

public class Compuesto extends ElementoHotel {

	private ArrayList<ElementoHotel> elementos;
	
	public Compuesto() {
		this.elementos = new ArrayList<>();
	}

	@Override
	public ArrayList<Habitacion> cumple(Criterio c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCantCamas() {
		int total = 0;
		for(ElementoHotel e: elementos){
			total += e.getCantCamas();
		}
		return total;
	}

}
