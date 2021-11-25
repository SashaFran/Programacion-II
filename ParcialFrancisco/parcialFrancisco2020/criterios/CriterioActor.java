package parcialFrancisco2020.criterios;
import parcialFrancisco2020.Actor;
import parcialFrancisco2020.Pelicula;


public class CriterioActor implements Criterio {

	private Actor actor1;
	
	public CriterioActor(Actor ac1) {
		this.actor1=ac1;
	}
	
	public boolean cumple(Pelicula p) {
		return p.contieneActor(actor1);
	}

}
