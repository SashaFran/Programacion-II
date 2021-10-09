package diccionario;

import java.util.ArrayList;
import diccionario.criterioDiccionario.CriterioDiccionario;

public class Diccionario {
	private ArrayList<Palabra> palabras ;
	
	public Diccionario(){
		palabras = new ArrayList<Palabra>();
	}
	
	public void addPalabra(Palabra p){
		if(!palabras.contains(p)){
			palabras.add(p);
		}
	}
	
	  public ArrayList<Palabra> encontrar(CriterioDiccionario criterio){
	        ArrayList<Palabra> pp = new ArrayList<Palabra>();
	        for (Palabra p: palabras) //foreach
	            if (criterio.existe(p))
	                pp.add(p);
	        return pp;
	    }
	
	
	
	
	
	
	
	
	
	
}
