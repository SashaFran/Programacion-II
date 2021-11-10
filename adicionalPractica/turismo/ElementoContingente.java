package turismo;

import java.time.LocalDate;
import java.util.ArrayList;

import turismo.Criterios.Criterio;

public abstract class ElementoContingente {

	protected String nombre;
	protected String destino;
	protected LocalDate fechaDePartida;
	protected LocalDate fechaDeRegreso;

	public ElementoContingente(String nombre, String destino, LocalDate fechaDePartida, LocalDate fechaDeRegreso) {
		super();
		this.nombre = nombre;
		this.destino = destino;
		this.fechaDePartida = fechaDePartida;
		this.fechaDeRegreso = fechaDeRegreso;
	}

	public abstract double getPrecio();

	public abstract double getDeuda();

	public abstract int totalAlumnos();

	public abstract ElementoContingente copia();

	public abstract ArrayList<ElementoContingente> busquedaFiltro(Criterio c);

	public abstract Alumno busquedaAlumnoDeudor();

	public String getNombre() {
		return nombre;
	}

	public String getDestino() {
		return destino;
	}
	
	public LocalDate getFechaDePartida() {
		return fechaDePartida;
	}


	public LocalDate getFechaDeRegreso() {
		return fechaDeRegreso;
	}



}
