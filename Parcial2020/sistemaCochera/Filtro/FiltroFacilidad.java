package sistemaCochera.Filtro;

import sistemaCochera.Auto;

public class FiltroFacilidad extends Filtro{
	
	private String facilidad;
	
	
	public FiltroFacilidad(String facilidad) {
		this.facilidad = facilidad;
	}

	public boolean cumple(Auto a) {
		return a.cumpleFacilidad(facilidad);
	}
	
	

}
