package sistemaVestimentas;

public class CriterioEstacion extends Criterio {

	private String estacion;
	
	public CriterioEstacion(String estacion) {
		super();
		this.estacion = estacion;
	}

	@Override
	public boolean cumple(ElementoVestimenta e) {
		return e.contieneEstacion(estacion);
	}

}
