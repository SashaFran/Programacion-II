package turismo;
import turismo.Filtro.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class PaquetePromoAlter extends PaqueteViaje {
 // UNA OPCION A PAQUETEPROMO 
	private PaqueteViaje apuntado;
	private LocalDate fInicio;
	private LocalDate fFin;
	private double descuento;
	
	
	
	public double getCosto() {
	
       if (this.getFechaPago()!=null) {
    	   
    	   if (this.getFechaPago().isBefore(fFin) && 
    			  this.getFechaPago().isAfter(fInicio) )
    		   
    		   return apuntado.getCosto()*descuento;
    	   
       } 
       return apuntado.getCosto();
	}

	
	
	
	@Override
	public String getOrigen() {
		
		return apuntado.getOrigen();
	}

	@Override
	public String getDestino() {
		
		return apuntado.getDestino();
	}

	@Override
	public LocalDate getFechaPago() {
		
		return apuntado.getFechaPago();
	}

	public PaquetePromoAlter(double des, LocalDate fi, LocalDate ff, PaqueteViaje pp) {
		super(0,0);
		apuntado =pp;
		fFin = ff;
		fInicio = fi;
		descuento = des;
	}
	
	public int id() {
		return apuntado.getId();
	}

	public int getCantidadPersonas() {
		return apuntado.getCantidadPersonas();
	}

	public ArrayList<PaqueteViaje> buscar(Filtro ff){
		   
		  return apuntado.buscar(ff);
		  
		}
	
}
