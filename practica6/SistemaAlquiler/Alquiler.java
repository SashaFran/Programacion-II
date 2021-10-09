package SistemaAlquiler;

import java.time.LocalDate;

public class Alquiler {

	
	private ElementoAlquilado elemento;
	private Cliente cliente;
	private LocalDate fechaLimite;
	
	public Alquiler(Cliente cliente, ElementoAlquilado elemento, LocalDate fechaLimite){
		this.fechaLimite = fechaLimite;
		this.cliente = cliente;
		this.fechaLimite = fechaLimite;
	}

	public ElementoAlquilado getElemento() {
		return elemento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public LocalDate getFechaLimite() {
		return fechaLimite;
	}
	
	public boolean isVencido(){
		boolean vencido = false;
		LocalDate hoy = LocalDate.now();
		if ((this.getFechaLimite().getMonthValue() > hoy.getMonthValue())&&(this.getFechaLimite().getDayOfMonth() > hoy.getDayOfMonth())){
			vencido = true;
		}else{
			vencido = false;
		}
		return vencido;
	}
	
	@Override
	public String toString(){
		return "Cliente: "+this.getCliente()+"\nAlquiler de: "+this.elemento+"\nFecha limite de entrega: "+this.getFechaLimite()+"\n";
	}
	
	

	
	
}
