package filtros;

import sujetos.ElementoEgreso;

public class FiltroDebe extends Filtro {
	private double deudaMaxima;
	
	public FiltroDebe(double deudaMaxima) {
		this.deudaMaxima = deudaMaxima;
	}

	@Override
	public boolean cumple(ElementoEgreso e) {
		return e.getDeuda() > deudaMaxima;
	}

}
