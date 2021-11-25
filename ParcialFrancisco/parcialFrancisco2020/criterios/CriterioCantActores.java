package parcialFrancisco2020.criterios;
import parcialFrancisco2020.Pelicula;


public class CriterioCantActores implements Criterio{

	private int cantidad;
	
	public CriterioCantActores (int cant) {
		cantidad=cant;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		return p.cantPeliculas()> cantidad;
	}

}
