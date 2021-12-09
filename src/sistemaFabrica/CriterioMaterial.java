package sistemaFabrica;

public class CriterioMaterial extends Criterio {

	private String mat;
	
	public CriterioMaterial(String mat) {
		super();
		this.mat = mat;
	}

	@Override
	public boolean acepta(Pedido mueble) {
		return mueble.getMueble().getMaterial().equals(mat);
	}

}
