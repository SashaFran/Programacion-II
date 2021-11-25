package empSoftware;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public abstract class ElementoEmp {

	private String nombre, apellido;
	private int edad;
	
	public ElementoEmp(String nombre, String apellido, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public abstract ArrayList<ElementoEmp>listaEmpleados();

	public abstract ArrayList<String> getConocimientos();
	public abstract int Sueldo();
	public abstract int cantEmp();
	
	public ArrayList<ElementoEmp>ListaOrdenada(Comparator<ElementoEmp> t){
		ArrayList<ElementoEmp> listaTotal = this.listaEmpleados();		
		Collections.sort(listaTotal, t);
		return listaTotal;
	}
	

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}
}
