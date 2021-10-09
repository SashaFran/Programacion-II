package diccionario.criterioDiccionario;

import diccionario.Palabra;

public class CriterioDefinicion extends CriterioDiccionario{
	
	private String texto;
	
	public CriterioDefinicion(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public boolean existe(Palabra p) {
		return p.getDefinicion().equals(texto);
	}

}
