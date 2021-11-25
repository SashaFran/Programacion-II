package parcialFrancisco2020.criterios;
import parcialFrancisco2020.Pelicula;


public class CriterioOr implements Criterio {

	private Criterio c1;
	private Criterio c2;
	
	public CriterioOr(Criterio cc1, Criterio cc2) {
		c1=cc1;
		c2=cc2;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		return c1.cumple(p)|| c2.cumple(p);
	}

}
