package turismo;
import turismo.Criterios.Criterio;

import java.time.LocalDate;
import java.util.ArrayList;



public class Alumno extends ElementoContingente {

	private double precio;
	private double deuda;

	public Alumno(String nombre, String destino, LocalDate fechaDePartida, LocalDate fechaDeRegreso, double precio,
			double deuda) {
		super(nombre, destino, fechaDePartida, fechaDeRegreso);
		this.precio = precio;
		this.deuda = deuda;
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}

	@Override
	public double getDeuda() {
		// TODO Auto-generated method stub
		return deuda;
	}

	@Override
	public int totalAlumnos() {

		return 1;
	}

	@Override
	public ElementoContingente copia() {
		return new Alumno(this.getNombre(), this.getDestino(), this.getFechaDePartida(), this.getFechaDeRegreso(),
				this.getDeuda(), this.getPrecio());
	}

	@Override
	public ArrayList<ElementoContingente> busquedaFiltro(Criterio c) {
		ArrayList<ElementoContingente> elementoBuscado = new ArrayList<>();
		if (c.cumple(this)) {
			elementoBuscado.add(this);
		}
		return elementoBuscado;
	}

	@Override
	public Alumno busquedaAlumnoDeudor() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public String toString() {
		return "Alumno " + this.getNombre()
				+ "\nprecio=" + precio + ", deuda=" + deuda + "]";
	}
	
	

}
