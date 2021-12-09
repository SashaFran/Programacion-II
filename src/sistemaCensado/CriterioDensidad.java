package sistemaCensado;

public class CriterioDensidad extends Criterio {

	private double densidadMin;
	
	public CriterioDensidad(double densidadMin) {
		this.densidadMin = densidadMin;
	}

	@Override
	public boolean cumple(Comarca c) {
		double densidad = c.cantHabitantes() / c.superficieTotal();
		return densidad > densidadMin;
	}

}
