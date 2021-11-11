package filtros;

import java.time.LocalDate;

import sujetos.ElementoEgreso;

public class FiltroFechaPartida extends Filtro {
	private LocalDate fechaPartida;
	
	public FiltroFechaPartida(LocalDate fecha) {
		this.fechaPartida = fecha;
	}

	@Override
	public boolean cumple(ElementoEgreso e) {
		return e.getFechaPartida().equals(fechaPartida);
	}

}
