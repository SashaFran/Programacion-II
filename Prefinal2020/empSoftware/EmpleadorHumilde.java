package empSoftware;

import java.util.ArrayList;

public class EmpleadorHumilde extends Empleador {

	public final int MAXIMO = 5;
	
	public EmpleadorHumilde(String nombre, String apellido, int edad, int a) {
		super(nombre, apellido, edad, a);
	}
	
	public ArrayList<String> getConocimientos(){
		ArrayList<String> aux = new ArrayList<>();
			for(int i = 0; i<MAXIMO; i++){
				ArrayList<String> union = super.getConocimientos();
				for(String s: union)
					if(!aux.contains(s)){
						aux.add(s);
					}
		}
		return aux;
	}

}
