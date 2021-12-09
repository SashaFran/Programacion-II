package sistemaFabrica;

import java.util.Comparator;

public class ComparadorPrecio implements Comparator<Pedido> {

	
	@Override
	public int compare(Pedido o1, Pedido o2) {
		return (int) (o1.getMueble().getCosto() - o2.getMueble().getCosto());
	}

}
