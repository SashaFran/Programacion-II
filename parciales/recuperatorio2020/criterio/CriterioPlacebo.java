package recuperatorio2020.criterio;
import recuperatorio2020.Voluntario;


public class CriterioPlacebo implements Criterio {

	
	@Override
	public boolean cumple(Voluntario v) {
		return v.isRecibioPlacebo();
	}

}
