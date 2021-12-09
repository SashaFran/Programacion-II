package sistemaCensado;

import java.util.ArrayList;

public class Comarca  extends ElementoCensado implements Comparable<Comarca>{

	private double superficie, ingresos;
	private int cantHabitantes;

	public Comarca(String nombre, double superficie, double ingresos,
			int cantHabitantes) {
		super(nombre);
		this.superficie = superficie;
		this.ingresos = ingresos;
		this.cantHabitantes = cantHabitantes;
	}

	@Override
	public int cantHabitantes() {
		return cantHabitantes;
	}

	@Override
	public double superficieTotal() {
		return superficie;
	}

	@Override
	public double capitalTotal() {
		return ingresos;
	}

	@Override
	public ArrayList<Comarca> buscar(Criterio c) {
		ArrayList<Comarca> aux = new ArrayList<>();
		if(c.cumple(this))
			aux.add(this);
		return aux;
	}

	@Override
	public int compareTo(Comarca a) {
		return this.getNombre().compareTo(a.getNombre());
	}
	
}
