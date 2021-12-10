package sistemaDelivery;

public class CriterioReceta extends Criterio{

	private String tipo;
	
	public CriterioReceta(String tipo) {
		super();
		this.tipo = tipo;
	}

	@Override
	public boolean acepta(Receta r) {
		return r.getTipoReceta().equals(tipo);
	}

}
