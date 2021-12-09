package sistemaBazar;

public class ComboCriterio extends Combo {

	public ComboCriterio(String nombre, Criterio c) {
		super(nombre, c);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public double getPrecio() {
		double total = this.getPrecio();
		
		return total / this.cantElem();
	}

}
