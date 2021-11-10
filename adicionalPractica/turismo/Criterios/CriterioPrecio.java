package turismo.Criterios;

import turismo.ElementoContingente;

public class CriterioPrecio extends Criterio {

	@Override
	public boolean cumple(ElementoContingente e) {
		// TODO Auto-generated method stub
		return e.getDeuda() > e.getPrecio()/2;
	}

}
