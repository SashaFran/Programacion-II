package turismo;

import java.time.LocalDate;
import java.util.ArrayList;

import turismo.criterios.Criterio;

public class PaqueteEspecial extends ElementosTurismo{

	private String nombre;
	private int id;
	private int cantMiembros;
	private String alojamiento;
	private String origen, destino;
	private LocalDate fechaPago;
	private double costo, descuento;
	private LocalDate inicioPromo, finPromo;
	private ArrayList<ElementosTurismo> miembros;
	
	
	public PaqueteEspecial(String nombre, int id, int c,String a, String o, String d, double costo, LocalDate ip, LocalDate fp){
		this.nombre = nombre;
		this.id = id;
		this.cantMiembros = c;
		this.alojamiento = a;
		this.origen = o;
		this.destino = d;
		this.costo = costo;
		this.fechaPago = null;
		this.inicioPromo = ip;
		this.finPromo = fp;
		this.descuento = 25;
		miembros = new ArrayList<>();
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
	public int cantMiembros() {
		int suma = 0;
		for (ElementosTurismo e: miembros)
			suma += e.cantMiembros();
		return suma;
	}

	@Override
	public double getCosto() {
		double promo = 0.0;
		if((fechaPago().isAfter(getInicioPromo()))&&(fechaPago().isBefore(getInicioPromo()))){
			promo = costo + (costo * descuento);
		}
		return promo;
	}
	

	public String getNombre() {
		return nombre;
	}
	public int getCantMiembros() {
		return cantMiembros;
	}
	public String getAlojamiento() {
		return alojamiento;
	}
	public LocalDate getInicioPromo() {
		return inicioPromo;
	}
	public LocalDate getFinPromo() {
		return finPromo;
	}
	
	public LocalDate fechaPago() {
		return null;
	}

	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}
	@Override
	public ArrayList<PaqueteSimple> paquetesxCriterio(Criterio c) {
		ArrayList<PaqueteSimple> listaPaquetes = new ArrayList<>();
		if (c.cumple(this))
			listaPaquetes.addAll(this);
		return listaPaquetes;
	}

}
