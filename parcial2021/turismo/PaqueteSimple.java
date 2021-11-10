package turismo;
import turismo.Filtro.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class PaqueteSimple extends PaqueteViaje {

	private String origen;
	private String destino;
	private double costo;
	private String datosAlo;
	private LocalDate fechaPago;
	
	
	
	
	public PaqueteSimple(int cantidadPersonas, int id, String origen, String destino, double costo, String datosAlo) {
		super(cantidadPersonas, id);
		this.origen = origen;
		this.destino = destino;
		this.costo = costo;
		this.datosAlo = datosAlo;
		this.fechaPago = null;
	}

	@Override
	public String getOrigen() {
		
		return origen;
	}

	@Override
	public String getDestino() {
		
		return destino;
	}

	@Override
	public double getCosto() {
		
		return costo;
	}

	@Override
	public LocalDate getFechaPago() {
		
		return fechaPago;
	}

	public String getDatosAlo() {
		return datosAlo;
	}

	public void setDatosAlo(String datosAlo) {
		this.datosAlo = datosAlo;
	}

	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}
	
	public ArrayList<PaqueteViaje> buscar(Filtro ff){
	  ArrayList<PaqueteViaje> result = new ArrayList<PaqueteViaje>();
	  	if (ff.cumple(this)){
		  result.add(this);
	  }
	  
	  return result;
	  
	}
	

}
