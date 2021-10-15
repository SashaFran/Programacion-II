package diccionario.criterioDiccionario;

import diccionario.Palabra;

public class CriterioAntonimo extends CriterioDiccionario{

	private String palabra;
	
	public CriterioAntonimo(String existe){
		this.palabra = existe;
	}
	
	public String getExiste() {
		return palabra;
	}

	public void setExiste(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public boolean existe(Palabra p) {
		return p.getAntonimos().equals(palabra);
	}

}
