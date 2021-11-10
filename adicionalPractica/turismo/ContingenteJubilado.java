package turismo;

import java.time.LocalDate;

import turismo.Criterios.Criterio;

public class ContingenteJubilado extends Contingente {

	public ContingenteJubilado(String nombre, String destino, LocalDate fechaDePartida, LocalDate fechaDeRegreso,
			Criterio criterioAdmision) {
		super(nombre, destino, fechaDePartida, fechaDeRegreso, criterioAdmision);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrecio() {
		return super.getPrecio() / this.elementos.size();
	}

}
