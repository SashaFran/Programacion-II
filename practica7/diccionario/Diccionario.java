package diccionario;

import java.util.ArrayList;
import java.util.Collections;



public class Diccionario{
	ArrayList<Palabra>palabras_alfabeticamente;

	public Diccionario() {
		palabras_alfabeticamente= new ArrayList<>();
	}
	
	
	public void agregarPalabra(Palabra p) {
		if (!palabras_alfabeticamente.contains(p)) {
			palabras_alfabeticamente.add(p);
			Collections.sort(palabras_alfabeticamente);
			}
		}
	
	public ArrayList<Palabra>mostrarDiccionario(){
		return (ArrayList<Palabra>)palabras_alfabeticamente.clone();
	}
	
	public void ordenar_alfabeticamente() {
		ArrayList<Palabra>ordenados;
	}
	
	public void modificar_palabra(Palabra p) {
			if (palabras_alfabeticamente.contains(p) ) {
				int indice_modificar= palabras_alfabeticamente.indexOf(p);
					palabras_alfabeticamente.get(indice_modificar).modificarpalabra(p);
			}
		}
	
	public void eliminar_palabra(Palabra p ) {
		if (palabras_alfabeticamente.contains(p) ) {
			int indice_modificar= palabras_alfabeticamente.indexOf(p);
				palabras_alfabeticamente.remove(indice_modificar);
		}
	}
	
	public ArrayList<String> mostrar_antonimos_de(Palabra p ) {
		if (palabras_alfabeticamente.contains(p) ) {
			int indice= palabras_alfabeticamente.indexOf(p);
			return palabras_alfabeticamente.get(indice).getAntonimos();
		}
		return null;
	}
	public ArrayList<String> mostrar_sinonimos_de(Palabra p ) {
		if (palabras_alfabeticamente.contains(p) ) {
			int indice= palabras_alfabeticamente.indexOf(p);
			return palabras_alfabeticamente.get(indice).getSinonimos();
		}
		return null;
	}
	
	public ArrayList<Palabra>mostrarPalabras_entre(Palabra p1,Palabra p2){
		ArrayList<Palabra>aux= new ArrayList<>();
		if ((palabras_alfabeticamente.contains(p1))&&(palabras_alfabeticamente.contains(p2))){
			int indice1= palabras_alfabeticamente.indexOf(p1);
			int indice2= palabras_alfabeticamente.indexOf(p2);
			if (indice1<indice2) {
			for (int i=indice1+1; i<indice2;i++) {
				aux.add(palabras_alfabeticamente.get(i));
			}
		}
	}	
		return aux;
	}
	
}

