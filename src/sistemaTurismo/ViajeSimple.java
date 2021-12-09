package sistemaTurismo;

import java.time.LocalDate;
import java.util.ArrayList;

public class ViajeSimple extends ElementoTurismo{


	private double costo;
	private LocalDate fechaPago;
	private String origen, destino;
	private ArrayList<String> datosAlojamiento;
	
	
	public ViajeSimple(int identificador, String nombre, int cantPasajeros,
			double costo, LocalDate fechaPago, String origen, String destino) {
		super(identificador, nombre, cantPasajeros);
		this.costo = costo;
		this.fechaPago = fechaPago;
		this.origen = origen;
		this.destino = destino;
		this.datosAlojamiento = new ArrayList<>();
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
	
	public ArrayList<String> getDatosAlojamiento() {
		return new ArrayList<String>(datosAlojamiento);
	}
	
	@Override
	public ArrayList<ElementoTurismo> buscar(Criterio c) {
		ArrayList<ElementoTurismo> aux = new ArrayList<>();
		if(c.cumple(this))
			aux.add(this);	
		return aux;
	}
	
	

	
	
}
