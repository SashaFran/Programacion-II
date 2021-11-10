package sistemaCochera.Filtro;

import sistemaCochera.Auto;

public class FiltroOr extends Filtro{

	
	private Filtro f1,f2;
	
	
	
	
	public FiltroOr(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}




	public boolean cumple(Auto a) {
		return f1.cumple(a) || f2.cumple(a);
	}

}
