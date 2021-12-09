package sistemaFabrica;

import java.time.LocalDate;

public class CriterioFecha extends Criterio {

	private LocalDate fecha;
	
	public CriterioFecha(LocalDate fecha) {
		super();
		this.fecha = fecha;
	}

	@Override
	public boolean acepta(Pedido mueble) {
		return mueble.getFechaMaxima().isBefore(fecha.minusDays(3));
	}

}
