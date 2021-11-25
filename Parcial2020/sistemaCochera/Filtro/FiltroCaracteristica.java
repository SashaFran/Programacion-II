package sistemaCochera.Filtro;

import sistemaCochera.Auto;

public class FiltroCaracteristica extends Filtro {

	private String caracteristica;

	

	public FiltroCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}



	public boolean cumple(Auto a) {
		return a.cumpleCaracteristica(caracteristica);
	}

}
