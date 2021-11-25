package parcialFrancisco2020;
import java.util.ArrayList;

import parcialFrancisco2020.criterios.Criterio;

public abstract class ElementP {

	
	public abstract int cantOscars();
	public abstract int cantPeliculas();
	
	public abstract double promedioPuntaje();
	public abstract ArrayList<Pelicula> listaPeliculasCriterio(Criterio c);
	public abstract ElementP getCopia(Criterio c);
}
