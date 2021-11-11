package filtros;

import sujetos.ElementoEgreso;

public class FiltroDeudaIgualA extends Filtro {
	private int valor;
	
	public FiltroDeudaIgualA(int valor) {
		this.valor = valor;
	}

	@Override
	public boolean cumple(ElementoEgreso e) {
		return e.getDeuda() == valor;
	}

}
