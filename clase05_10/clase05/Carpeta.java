package clase05;

import java.util.ArrayList;

public class Carpeta extends Elemento{

	private ArrayList<Elemento> elementos; 
	
	
	public Carpeta(String nombre){
		super(nombre);
		elementos = new ArrayList<Elemento>();
	}
	
	public int cantArchivos(){
		// return elementos.size(); Retorna la cantidad de hijos, no de archivos.
								//Solo mira hijos directos.
		int total = 0;
		for (Elemento e:elementos)
			total+=e.cantArchivos();
		return total;
	}
	
	public double getTamaño(){
		double total = 0.0;
		//la suma de tamaño de todos los archivos-
		for (Elemento a:elementos)
			total+=a.getTamaño();
		return total;
	}
	
}
