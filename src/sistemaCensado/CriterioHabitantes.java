package sistemaCensado;

public class CriterioHabitantes extends Criterio {

	private int habitantesMin;
	
	public CriterioHabitantes(int habitantesMin) {
		this.habitantesMin = habitantesMin;
	}

	@Override
	public boolean cumple(Comarca c) {
		return c.cantHabitantes() > habitantesMin;
	}

}
