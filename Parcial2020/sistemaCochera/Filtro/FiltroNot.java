package sistemaCochera.Filtro;

import sistemaCochera.Auto;

public class FiltroNot extends Filtro{

	private Filtro f1;
	
	
	
	public FiltroNot(Filtro f1) {
		this.f1 = f1;
	}



	public boolean cumple(Auto a) {
		return !f1.cumple(a);
	}

}
