package sistemaPaquetes;

public class CriterioAND extends Criterio {

	private Criterio c1, c2;
	
	public CriterioAND(Criterio c1, Criterio c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(ElementoPaquete c) {
		return c1.cumple(c) && c2.cumple(c);
	}

}
