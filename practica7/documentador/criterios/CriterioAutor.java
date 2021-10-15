package documentador.criterios;

import java.util.List;

import documentador.Documento;

public class CriterioAutor extends Criterio {

	private String filtro;
	
	public CriterioAutor(String filtro){
		this.filtro = filtro;
	}
	
	@Override
	public boolean cumple(Documento d1) {
		List<String> autores = d1.getAutores();
		for (String autor : autores){
			if ((autor.toUpperCase()).equals(filtro)){
				return true;
			}
		}
		return false;
	}

}
