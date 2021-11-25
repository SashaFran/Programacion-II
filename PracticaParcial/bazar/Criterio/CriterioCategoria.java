package bazar.Criterio;

import bazar.ElementoAbstracto;

public class CriterioCategoria extends Criterio {

	private String categoria;
	
	public CriterioCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public boolean cumple(ElementoAbstracto e) {
		return e.tieneCategoria(categoria);
	}

}
