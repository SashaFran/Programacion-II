package recuperatorio2020.criterio;
import recuperatorio2020.Voluntario;


public class CriterioContrajoEnfermedad implements Criterio {

	@Override
	public boolean cumple(Voluntario v) {
		return v.isContrajoEnfermedad();
	}

}
