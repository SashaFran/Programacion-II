package sistemaDelivery;

public class CriterioTipoCoccion extends Criterio {

	private String metodo;
	
	public CriterioTipoCoccion(String metodo) {
		super();
		this.metodo = metodo;
	}

	@Override
	public boolean acepta(Receta r) {
		return r.getModoPreparacion().equals(metodo);
	}

}
