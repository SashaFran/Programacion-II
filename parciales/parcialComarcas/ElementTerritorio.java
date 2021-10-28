package parcialComarcas;

import java.util.ArrayList;

import parcialComarcas.criterios.Criterio;

public abstract class ElementTerritorio {

	
	
	public abstract int cantHabitantes();
	public abstract double superficieTotal();
	public abstract double ingresosTotales();
	
	public double ingresosPerCapita() {
		return ingresosTotales()/cantHabitantes();
	}
	
	public double densidadPoblacion() {
		return cantHabitantes()/superficieTotal();
	}

	public abstract ArrayList<Comarca> listarComarcasporCriterio(Criterio c);
}
