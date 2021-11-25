package turismo;

import java.time.LocalDate;
import java.util.ArrayList;

import turismo.criterios.Criterio;

public class PaqueteSimple extends ElementosTurismo{
	
	private String nombre;
	private int id;
	private int cantMiembros;
	private String alojamiento;
	private String origen, destino;
	private LocalDate fechaPago;
	private double costo;
	private ArrayList<ElementosTurismo> miembros;
	
	public PaqueteSimple(String nombre, int id, int c,String a, String o, String d, double costo){
		this.nombre = nombre;
		this.id = id;
		this.cantMiembros = c;
		this.alojamiento = a;
		this.origen = o;
		this.destino = d;
		this.costo = costo;
		this.fechaPago = null;
		
	}

	public int getId() {
		return id;
	}

	public String getAlojamiento() {
		return alojamiento;
	}


	public LocalDate getFechaPago() {
		return fechaPago;
	}

	@Override
	public String getDestino() {
		return destino;
	}

	@Override
	public int cantMiembros() {
		int cant = 0;
		for (ElementosTurismo e: miembros)
			cant += e.cantMiembros();
		return cant;
	}
	
	public void addMiembros(ElementosTurismo e){
		miembros.add(e);
	}

	@Override
	public String getOrigen() {
		return origen;
	}

	@Override
	public double getCosto() {
		return costo;
	}

	@Override
	public LocalDate fechaPago() {
		return null;
	}

	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public ArrayList<PaqueteSimple> paquetesxCriterio(Criterio c) {
		return null;
	}

	@Override
	public String toString() {
		return "PaqueteSimple [nombre=" + nombre + ", id=" + id
				+ ", cantMiembros=" + cantMiembros + ", alojamiento="
				+ alojamiento + ", origen=" + origen + ", destino=" + destino
				+ "]";
	}
	
	

}
	
	