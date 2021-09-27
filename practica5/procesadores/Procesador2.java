package procesadores;

import java.util.ArrayList;

public class Procesador2 {
                      //EL tipo de elementos que guarda el arrasylist
	private ArrayList<Integer>  tareas;
	
	
	public Procesador2() {
		tareas = new ArrayList<Integer>();
	}
	
	//NUNCA LA COLECCION INTERNA se retorna
	public ArrayList<Integer> getTareas(){
		return new ArrayList<Integer>(tareas); //ROMPE ENCAPSULAMIENTO
	}
	
	public void addEntero(int x) {
		if (x>0) {
			tareas.add(x);
		}
	}
	
	
	public String toString() {
		return "Proc"+tareas.toString();
	}
}
