package facturacion;

import java.util.ArrayList;

public class Empresa {

	protected ArrayList<Empleado> empleados;
	
	public Empresa(){
		empleados = new ArrayList<Empleado>();
	}

	public ArrayList<Empleado> getEmpleados() {
		return new ArrayList<Empleado>();
	}
	public void addEmpleado(Empleado e) {
		this.empleados.add(e);
	}

	public void calcularPago(){
		//por cada empleado en el ArrayList
		for (Empleado e: this.empleados){
			System.out.println(e.mostrar());
		}
	}

	


}
