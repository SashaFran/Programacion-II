package fileSystem.criterios;

import java.time.LocalDate;

import fileSystem.ElementFileSystem;

public class CriterioDespuesFecha implements Criterio {

	private LocalDate fecha;
	
	
	public CriterioDespuesFecha(LocalDate fe) {
		this.fecha=fe;
	}
	

	@Override
	public boolean cumple(ElementFileSystem elem) {
		return elem.getFechaCreacion().isAfter(fecha);
	}
	
	
}
