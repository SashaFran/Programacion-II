package turismo;

import java.time.LocalDate;
import java.util.ArrayList;

import turismo.criterios.Criterio;

public abstract class ElementosTurismo {

	public abstract String getOrigen();
	public abstract String getDestino();
	public abstract int cantMiembros();
	public abstract double getCosto();
	public abstract LocalDate fechaPago();

	public abstract ArrayList<PaqueteSimple> paquetesxCriterio(Criterio c);

	
	
	
	
	
}
