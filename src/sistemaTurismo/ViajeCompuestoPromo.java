package sistemaTurismo;

import java.time.LocalDate;

public class ViajeCompuestoPromo extends ViajeSimple {

	private LocalDate fechaComiento;
	private LocalDate fechaFin;
	private double descuento;
	
	public ViajeCompuestoPromo(int identificador, String nombre, int cantPasajeros,
			double costo, LocalDate fechaPago, String origen, String destino, LocalDate fc,LocalDate ff) {
		super(identificador, nombre, cantPasajeros, costo,fechaPago, origen, destino);
		this.fechaComiento = fc;
		this.fechaFin = ff;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCosto() {
		double total = 0;
		if(this.getFechaPago() != null)
			if(this.getFechaPago().isBefore(this.fechaFin) && this.getFechaPago().isAfter(this.fechaComiento)){
				total = super.getCosto() + descuento;
			}else{
				return super.getCosto();
			}
		return total;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	

}
