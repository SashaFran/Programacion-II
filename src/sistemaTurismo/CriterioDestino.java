package sistemaTurismo;

public class CriterioDestino extends Criterio {

	private String destino;
	
	public CriterioDestino(String destino) {
		super();
		this.destino = destino;
	}

	@Override
	public boolean cumple(ElementoTurismo e) {
		return e.getDestino().equals(destino);
	}

}
