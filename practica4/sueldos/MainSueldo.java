package sueldos;

public class MainSueldo {

	public static void main(String[] args){
		Empleado e1 = new EmpleadoExtra(5);
		Empleado e2 = new Empleado();
		Empleado e3 = new EmpleadoComision(4);
		Empleado e4 = new Empleado();
		
		e1.addEmpleado(e1);
		e2.addEmpleado(e2);
		e3.addEmpleado(e3);
		e4.addEmpleado(e4);
		
		
		System.out.println("Empleado 1: " + e1);
		System.out.println("Empleado 2: " + e2);
		System.out.println("Empleado 3: " + e3);
		System.out.println("Empleado 4: " + e4);
		
	}
}
