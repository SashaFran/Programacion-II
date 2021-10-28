package recuperatorio2020.criterio;
import recuperatorio2020.Voluntario;


public class CriterioEdad implements Criterio {

	private int edad;
	
	public CriterioEdad(int e) {
		edad=e;
	}
	@Override
	public boolean cumple(Voluntario v) {
		return v.getEdad()>edad;
	}

}
