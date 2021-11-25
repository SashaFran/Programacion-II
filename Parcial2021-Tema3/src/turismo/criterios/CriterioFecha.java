package turismo.criterios;

import java.time.LocalDate;

import turismo.ElementosTurismo;

public class CriterioFecha extends Criterio {
	
	private LocalDate fechaLimite;
	
	public CriterioFecha(LocalDate f){
		this.fechaLimite = f;
	}
	
	@Override
	public boolean cumple(ElementosTurismo e) {
		return e.fechaPago().equals(fechaLimite);
	}

}
