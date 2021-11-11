package sujetos;

import java.time.LocalDate;

public class contingenciaJubilados extends Contingencia {

	public contingenciaJubilados(String nombre, String destino, LocalDate fechaPartida, LocalDate fechaRegreso,
			double deuda) {
		super(nombre, destino, fechaPartida, fechaRegreso, deuda);
	}
	
	@Override
	public double getDeuda() {
		//RETORNA EL PROMEDIO DE LA DEUDA TOTAL DE LOS PASAJEROS.
		double deudaTotal = 0;
		for(ElementoEgreso e: super.pasajeros) {
			deudaTotal += e.getDeuda();
		}
		return deudaTotal / super.cantPasajeros();
	}

}
