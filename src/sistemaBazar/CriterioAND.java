package sistemaBazar;

public class CriterioAND extends Criterio {

	private Criterio c1, c2;
	
	public CriterioAND(Criterio c1, Criterio c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(ElementoBazar e) {
		return c1.cumple(e) && c2.cumple(e);
	}

}
