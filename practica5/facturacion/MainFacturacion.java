package facturacion;

public class MainFacturacion {
	
	public static void main(String[] args){
		
		Empresa ee = new Empresa();
		Empleado e1 = new EmpleadoFijo("Pedro", "Juanse", 11111, 15000);
		Empleado e2 = new EmpleadoExtra("Juan1", "Pedronse1", 22222, 13000, 3);
		Empleado e3 = new EmpleadoFijo("Juan2", "Pedronse2", 22222, 13000);
		Empleado e4 = new EmpleadoExtra("Juan3", "Pedronse3", 22222, 13000, 3);
		
		ee.addEmpleado(e1);
		ee.addEmpleado(e2);
		ee.addEmpleado(e3);
		ee.addEmpleado(e4);
		ee.calcularPago();
		

	}
}
