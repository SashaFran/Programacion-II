package sistemaBazar;

public class CriterioCategoria extends Criterio {

	private String cat;
	
	public CriterioCategoria(String cat) {
		super();
		this.cat = cat;
	}

	@Override
	public boolean cumple(ElementoBazar e) {
		return e.contieneCategoria(cat);
	}

}
