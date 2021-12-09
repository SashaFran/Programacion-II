package sistemaCensado;

import java.util.ArrayList;

public abstract class ElementoCensado {

	private String nombre;
	
	public ElementoCensado(String nombre) {
		this.nombre = nombre;
	}

	public abstract int cantHabitantes();
	public abstract double superficieTotal();
	public abstract double capitalTotal();
	public abstract ArrayList<Comarca> buscar(Criterio c);
	
	public double capitalPorCabeza(){		
		return this.capitalTotal() / this.cantHabitantes();
	}
	
	public double densidad(){
		return this.cantHabitantes()/this.superficieTotal();		
	}

	public String getNombre() {
		return nombre;
	}
	
}
