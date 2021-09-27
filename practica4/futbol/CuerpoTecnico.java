package futbol;

import java.util.ArrayList;

public class CuerpoTecnico extends Seleccion{

	private ArrayList<Entrenador> entrenadores; 
	

	public CuerpoTecnico(){
		super();
		entrenadores = new ArrayList<Entrenador>();
	}
	
	public ArrayList<Entrenador> getEntrenadores() {
		return new ArrayList<Entrenador>(entrenadores);
	}

	
	
}
