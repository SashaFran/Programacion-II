package sistemaCochera.Filtro;

import sistemaCochera.Auto;

public class FiltroAnd extends Filtro{

	private Filtro f1,f2;
	
	

	public FiltroAnd(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}



	public boolean cumple(Auto a) {
		return f1.cumple(a) && f2.cumple(a);
	}

}
