package sistemaCensado;

import java.util.ArrayList;
import java.util.Collections;

public class Territorio extends ElementoCensado{

	ArrayList<ElementoCensado> elementos;

	
	public Territorio(String nombre) {
		super(nombre);
		this.elementos = new ArrayList<>();
	}

	@Override
	public int cantHabitantes() {
		int total = 0;
		for (ElementoCensado c: elementos)
			total += c.cantHabitantes();
		return total;
	}

	@Override
	public double superficieTotal() {
		double total = 0;
		for(ElementoCensado c: elementos)
			total += c.superficieTotal();
		return total;
	}

	@Override
	public double capitalTotal() {
		double total = 0;
		for (ElementoCensado c: elementos)
			total += c.capitalTotal();
		return total;
	}

	@Override
	public ArrayList<Comarca> buscar(Criterio c) {
		ArrayList<Comarca> aux = new ArrayList<>();
		for(ElementoCensado e: elementos)
			aux.addAll(e.buscar(c));
		Collections.sort(aux);
		return aux;
	}
	
}
