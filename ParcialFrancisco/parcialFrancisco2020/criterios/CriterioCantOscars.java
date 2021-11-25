package parcialFrancisco2020.criterios;
import parcialFrancisco2020.Pelicula;


public class CriterioCantOscars implements Criterio {

	private int cant;
	
	public CriterioCantOscars(int can) {
		this.cant=can;
	}
	@Override
	public boolean cumple(Pelicula p) {
		return p.cantOscars()> cant;
	}

}
