package sistemaCensado;

public class CriterioOR extends Criterio {

	private Criterio c1, c2;
	
	public CriterioOR(Criterio c1, Criterio c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(Comarca c) {
		return c2.cumple(c) || c1.cumple(c);
	}

}
