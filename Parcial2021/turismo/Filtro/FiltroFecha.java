package turismo.Filtro;
import turismo.PaqueteViaje;

import java.time.LocalDate;

public class FiltroFecha extends Filtro {

	
	private LocalDate fechaDada;
	
	@Override
	public boolean cumple(PaqueteViaje pp) {

	   LocalDate fechaPaquete = pp.getFechaPago();
	   //Si se usa mayor, menor o igual segun la consigna
	   if((fechaPaquete!=null)) {
		   return fechaPaquete.compareTo(fechaDada) >0;
	   } 
	   /* Esto ya esta bien
	    * if (fechaPaquete!=null)&&(fechaPaquete.equals(fechadada);
	    * return true;
	    */
	   return false;
	
	}

}
