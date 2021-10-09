package SistemaAlquiler;

import java.time.LocalDate;


public abstract class ElementoAlquilado {

	private LocalDate fechaEntrega;
	
	public ElementoAlquilado(){
		fechaEntrega = null;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public abstract String getElementoAlquilado();
	public abstract boolean isDisponible();
	public abstract void devolucion();
	public abstract void elementoAlquilado();
	
	

}
