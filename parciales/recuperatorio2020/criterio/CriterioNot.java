package recuperatorio2020.criterio;
import recuperatorio2020.Voluntario;


public class CriterioNot implements Criterio {

	private Criterio c;
	
	
	public CriterioNot(Criterio cc) {
		c=cc;
	}
	
	@Override
	public boolean cumple(Voluntario v) {
		return !c.cumple(v);
	}

}
