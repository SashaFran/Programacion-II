package sistemaTurismo;

import java.time.LocalDate;

public class CriterrioFecha extends Criterio {

	private LocalDate fecha;
	
	public CriterrioFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public boolean cumple(ElementoTurismo e) {
		LocalDate fechaViaje = e.getFechaPago();
		if(fechaViaje != null){
			return fechaViaje.compareTo(fecha) > 0;
		}
		return false;
	}

}
