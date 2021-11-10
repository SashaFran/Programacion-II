package turismo;
import turismo.Filtro.*;

import java.time.LocalDate;
import java.util.ArrayList;


public class PaqueteCompuesto extends PaqueteViaje {

	private ArrayList<PaqueteViaje> elementos;

	public PaqueteCompuesto(int id, int cant) {
		super(id, cant);
		this.elementos = new ArrayList<PaqueteViaje>();
	}
	
	
	public String getOrigen() {
		
		if (!elementos.isEmpty())
			 return elementos.get(0).getOrigen();
		else
			return null;
		
	}
	
	public String getDestino() {
		int size = elementos.size();
		
		if (size>0)
		  return elementos.get(size-1).getDestino();
		else
			 return null;
		
	}
	
	public double getCosto() {
		double aux = 0;
		for(int i=0; i<elementos.size();i++) {
			aux = aux + elementos.get(i).getCosto();
		}
		return aux;
		
	}
	
	public LocalDate getFechaPago() {
		LocalDate mayor =  LocalDate.of(1900, 1,1);
		for(int i=0; i<elementos.size();i++) {
			PaqueteViaje elementoI = elementos.get(i);
			LocalDate fecha = elementoI.getFechaPago();
			if (fecha==null) {
				return null;
			} else {
				if (fecha.compareTo(mayor)>0)
					mayor = fecha;
			}
		}
		return mayor; 
		
	}
	
	
	public void addPaquete(PaqueteViaje paquete) {
		if (paquete.getCantidadPersonas() == this.getCantidadPersonas()) {
			if (elementos.size()==0) {
				elementos.add(paquete);
			} else {
				if (this.getDestino().equals(paquete.getOrigen()))
					elementos.add(paquete);
			}
		}
	}
	
	public ArrayList<PaqueteViaje> buscar(Filtro ff){
		  ArrayList<PaqueteViaje> result = new ArrayList<PaqueteViaje>();
		  
		  if (ff.cumple(this)) {
			  result.add(this);
		  } else {
			   for(int i =0; i<elementos.size();i++) {
				   ArrayList<PaqueteViaje> aux =elementos.get(i).buscar(ff);
				   
				   result.addAll(aux);
			   }
		  }
		  
		  return result;
		  
		}
	
	
	
}
