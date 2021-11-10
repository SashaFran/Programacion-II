package turismo;

import java.time.LocalDate;

import turismo.Criterios.*;

public class Main {

	public static void main(String[] args) {
		
		
		Alumno a1 = new Alumno("Mario","Mar del Plata", LocalDate.of(2021, 11, 10), LocalDate.of(2021, 11, 20),1000, 800);		
		Alumno a2 = new Alumno("Lucio","Mar del Plata", LocalDate.of(2021, 11, 10), LocalDate.of(2021, 11, 20),1000, 900);
		Alumno a3 = new Alumno("Roberto","Mar del Plata", LocalDate.of(2021, 11, 10), LocalDate.of(2021, 11, 20),1000, 1000);
		Alumno a4 = new Alumno("Lucia","Mar del Cabo", LocalDate.of(2021, 11, 10), LocalDate.of(2021, 11, 20),1000, 500);
	
		Criterio criterioDestino = new CriterioAdmisionDestino("Mar del Plata");
		
		Contingente c1 = new Contingente("BarcoLoco", "Mar del Plata", LocalDate.of(2021, 11, 10), LocalDate.of(2021, 11, 20), criterioDestino);
		Contingente c2 = new Contingente("BarcoLoco 2 ", "Mar del Plata", LocalDate.of(2021, 11, 10), LocalDate.of(2021, 11, 20), criterioDestino);
		
		c2.agregarElemento(c1);
		c1.agregarElemento(a4);
		c2.agregarElemento(a1);
		c2.agregarElemento(a2);
		c2.agregarElemento(a3);
		
		System.out.println("deuda total de: " + c2.getDeuda());
		System.out.println("total viajeros: " + c2.totalAlumnos());
		System.out.println("mayor deudor: " + c2.busquedaAlumnoDeudor());
		
	
	}
	
}
