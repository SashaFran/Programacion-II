package sistemaVestimentas;

public class CriterioColor extends Criterio {

	private String color;
	
	public CriterioColor(String color) {
		super();
		this.color = color;
	}

	@Override
	public boolean cumple(ElementoVestimenta e) {
		return e.contieneColor(color);
	}

}
