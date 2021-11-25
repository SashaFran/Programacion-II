package empSoftware;

import java.util.Comparator;

import empSoftware.Comparador.*;

public class MainSoftware {

	public static void main(String[] args) {
	
		Empleador ee = new Empleador("E1", "A1", 45, 15);
		Empleador e1 = new Empleador("E2", "A2", 40, 10);
		Empleador e2 = new EmpleadorHumilde("E3", "A3", 29, 2);
		
		Programador pp = new Programador("Pedro", "Vaca", 25, new SueldoMensual(30000, 0));
		Programador p1 = new Programador("Juan", "Cebra", 35, new SueldoMensual(35000, 2));
		Programador p2 = new Programador("Maria", "Zeta", 45, new SueldoMensual(45000, 3));
		Programador p3 = new Programador("Lujan", "A3", 27, new SueldoMensual(66000, 6));
		Programador p4 = new Programador("Alberto", "A4", 27, new SueldoMensual(76000, 3));
		Programador p5 = new Programador("Albert", "A4", 27, new SueldoMensual(76089, 4));
		Programador p6 = new Programador("Berto", "A4", 27, new SueldoMensual(7000, 0));
		Programador p7 = new Programador("Ber", "A4", 27, new SueldoMensual(86000, 1));
		
		
		pp.addConocimientos("Java");
		pp.addConocimientos("Python");
		
		p1.addConocimientos("Php");
		p1.addConocimientos("Javascript");
		p1.addConocimientos("Java");
		
		p2.addConocimientos("Angular");
		p2.addConocimientos("Php");
		
		p3.addConocimientos("Javascript");
		p3.addConocimientos("Php");
		
		p4.addConocimientos("Java");
		p4.addConocimientos("Python");
		
		
		
		ee.addProgramador(pp);
		ee.addProgramador(p1);
		ee.addProgramador(p2);
		
		e1.addProgramador(p3);
		e1.addProgramador(p4);
		
		e2.addProgramador(pp);
		e2.addProgramador(p1);
		e2.addProgramador(p2);
		e2.addProgramador(p3);
		e2.addProgramador(p4);
		e2.addProgramador(p5);
		e2.addProgramador(p6);
		e2.addProgramador(p7);
		
		
		
		ComparadorNombre nombre = new ComparadorNombre();
		ComparadorApellido apellido = new ComparadorApellido();
		Comparator<ElementoEmp> emp = new ComparadorCompuesto(nombre, apellido);
		
		System.out.println("Empleador: "+ ee.ListaOrdenada(emp));
		System.out.println("Gasto en saldo: " + ee.Sueldo());
		System.out.println("Cantidad de empleados por encargado "+ee.getNombre()+": "+ee.cantEmp());
		
		
		System.out.println("Empleador humilde: " + e2.getConocimientos());
	}

}
