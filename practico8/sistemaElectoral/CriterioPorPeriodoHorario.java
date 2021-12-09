package sistemaElectoral;

import java.time.LocalDateTime;

public class CriterioPorPeriodoHorario extends Criterio {
	
	
	private LocalDateTime desde;
	private LocalDateTime hasta;
	
	public CriterioPorPeriodoHorario(LocalDateTime desde, LocalDateTime hasta) {
		super();
		this.desde = desde;
		this.hasta = hasta;
	}

	@Override
	public boolean cumple(Voto v) {
		return v.getHoraVoto().isAfter(desde) && v.getHoraVoto().isBefore(hasta);
	}

}
