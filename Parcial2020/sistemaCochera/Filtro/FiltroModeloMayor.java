package sistemaCochera.Filtro;

import sistemaCochera.Auto;

public class FiltroModeloMayor extends Filtro{

	private int modelo;
	
	

	public FiltroModeloMayor(int modelo) {
		super();
		this.modelo = modelo;
	}



	public boolean cumple(Auto a) {
		return a.getModelo() > modelo;
	}
	

}
