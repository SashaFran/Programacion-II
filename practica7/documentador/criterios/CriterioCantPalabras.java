package documentador.criterios;

import documentador.Documento;

public class CriterioCantPalabras extends Criterio {

	private int filtro;
	
	public CriterioCantPalabras(int filtro){
		this.filtro = filtro;
	}
	
	@Override
	public boolean cumple(Documento d1) {
		String[] palabras = d1.getContenido().split(" ");
		return palabras.length > filtro;
	}


}
