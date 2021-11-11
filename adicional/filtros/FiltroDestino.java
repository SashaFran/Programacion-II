package filtros;

import sujetos.ElementoEgreso;

public class FiltroDestino extends Filtro {
	private String destino;
	
	public FiltroDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public boolean cumple(ElementoEgreso e) {
		return e.getDestino().equals(destino);
	}

}
