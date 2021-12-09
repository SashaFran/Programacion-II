package sistemaTurismo;

public class CriterioNOT extends Criterio {

	private Criterio c1;
	
	public CriterioNOT(Criterio c1) {
		super();
		this.c1 = c1;
	}

	@Override
	public boolean cumple(ElementoTurismo e) {
		return !c1.cumple(e);
	}

	
}
