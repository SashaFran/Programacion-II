package fileSystem.criterios;

import java.time.LocalDate;

import fileSystem.ElementFileSystem;

public class CriterioDespuesFechaModif implements Criterio{

	private LocalDate fechamodif;
	
	public CriterioDespuesFechaModif(LocalDate fe) {
		this.fechamodif=fe;
	}
	
	@Override
	public boolean cumple(ElementFileSystem elem) {
		return elem.getFechaModificacion().isAfter(fechamodif);
	}

	
}
