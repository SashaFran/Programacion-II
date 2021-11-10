package turismo.Criterios;

import java.time.LocalDate;

import turismo.ElementoContingente;

public class CriterioAdmisionFecha extends Criterio {

	private LocalDate fecha;

	public CriterioAdmisionFecha(LocalDate fecha) {
		super();
		this.fecha = fecha;
	}

	@Override
	public boolean cumple(ElementoContingente e) {
		// TODO Auto-generated method stub
		return e.getFechaDePartida().isEqual(fecha);
	}

}
