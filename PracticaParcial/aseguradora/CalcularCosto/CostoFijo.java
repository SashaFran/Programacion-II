package aseguradora.CalcularCosto;

import aseguradora.Simple;

public class CostoFijo extends Calculadora{

	private double montoFijo;
	
	public CostoFijo(double montoFijo) {
		this.montoFijo = montoFijo;
	}

	@Override
	public double calcular(Simple e) {
		// TODO Auto-generated method stub
		return montoFijo;
	}

}
