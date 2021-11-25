package aseguradora.CalcularCosto;

import aseguradora.Simple;

public class Porcentaje extends Calculadora {

	  private double porcentaje;

	  public Porcentaje(double porcentaje) {
	        this.porcentaje = porcentaje;
	  }

	    @Override
	  public double calcular(Simple e) {
	    return e.getMontoAsegurado() * porcentaje;
	   }


}
