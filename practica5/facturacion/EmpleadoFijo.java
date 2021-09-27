package facturacion;

public class EmpleadoFijo extends Empleado{
	
	
	
	public EmpleadoFijo(String nombre, String apellido, int DNI, int sueldoFijo) {
		super(nombre, apellido, DNI, sueldoFijo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getSueldoMensual() {
		return (double) super.getSueldoFijo();
		
	}

	@Override
	public String mostrar() {
		return "Nombre: "+super.getNombre()+" Apellido: "+super.getApellido() + "\nSalario Mensual de: "+this.getSueldoMensual();
	}

	public String toString(){
		return super.toString()+ "Empleado con sueldo fijo "+super.getSueldoFijo();
	}
	}

	


