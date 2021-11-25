package aseguradora.CalcularCosto;

import aseguradora.Simple;

public class Suma extends Calculadora {
	
	private Calculadora c1, c2;
	

	public Suma(Calculadora c1, Calculadora c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public double calcular(Simple e) {
		return c1.calcular(e)+c2.calcular(e);
	}

}
