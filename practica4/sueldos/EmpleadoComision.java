package sueldos;

public class EmpleadoComision extends Empleado{
	
	private int cantVentas;
	private Double porcentaje;
	
	public EmpleadoComision(){
		super();
	}
	
	public EmpleadoComision(int cantVentas){
		this.cantVentas = cantVentas;
		this.porcentaje = 0.15;
	}
	
	public int getSalarioFinal(){
		return (int)(((super.getSueldoFijo() * getPorcentaje())* getCantVentas())+ super.getSueldoFijo());
	}
	
	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public Double getPorcentaje() {
		return porcentaje;
	}
	public String toString(){
		return "Empleado comision con un salario de: " + this.getSalarioFinal();
	}
}
