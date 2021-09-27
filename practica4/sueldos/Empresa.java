package sueldos;
import java.util.ArrayList;

public class Empresa {
	
	private ArrayList<Empleado> empleados; 

	public Empresa(){
		this.empleados = new ArrayList<Empleado>();
	}
	
	public void addEmpleado(Empleado empleado){
		this.empleados.add(empleado);
	}
	

}
