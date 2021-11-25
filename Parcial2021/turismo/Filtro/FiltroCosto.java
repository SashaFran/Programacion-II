package turismo.Filtro;
import turismo.PaqueteViaje;

public class FiltroCosto extends Filtro {

	private double costo;
	
	
	
	public FiltroCosto(double costo) {
		super();
		this.costo = costo;
	}



	@Override
	public boolean cumple(PaqueteViaje pp) {

		return pp.getCosto()>costo;
	}

}
