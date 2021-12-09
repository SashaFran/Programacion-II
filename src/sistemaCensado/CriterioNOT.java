package sistemaCensado;

public class CriterioNOT extends Criterio {

	private Criterio c1;
	
	public CriterioNOT(Criterio c1) {
		this.c1 = c1;
	}

	@Override
	public boolean cumple(Comarca c) {
		return !c1.cumple(c);
	}

}
