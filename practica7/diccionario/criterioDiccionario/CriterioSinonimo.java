package diccionario.criterioDiccionario;

import diccionario.Palabra;

public class CriterioSinonimo extends CriterioDiccionario{
	
	private String palabra;
	
	public CriterioSinonimo(String palabra) {
		this.palabra = palabra;
	}

	public String getPalabra() {
		return palabra;
	}


	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public boolean existe(Palabra p) {
		return p.getAntonimo().equals(palabra);
	}

}
