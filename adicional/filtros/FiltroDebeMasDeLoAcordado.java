package filtros;

import sujetos.ElementoEgreso;

public class FiltroDebeMasDeLoAcordado extends Filtro {
	private double deudaAcordada;
	private int cantidadVeces;
	
	
	public FiltroDebeMasDeLoAcordado(double deudaAcordada, int cantidadVeces) {
		this.deudaAcordada = deudaAcordada;
		this.cantidadVeces = cantidadVeces;
	}

	@Override
	public boolean cumple(ElementoEgreso e) {
		return deudaAcordada < e.getDeuda() / cantidadVeces;
	}

}
