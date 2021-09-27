package pilaElementos;

import java.util.ArrayList;
import java.util.Collections;

public class Pila {

	private ArrayList<String> pila;
	
	public Pila(){
		this.pila = new ArrayList<String>();
	}

	public void setPila(ArrayList<String> pila) {
		this.pila = pila;
	}

	public ArrayList<Pila> getPila() {
		return new ArrayList<Pila>();
	}

	public void push(String elemento) {
		pila.add(elemento);
	}

	public void pop() {
		int ultimo = pila.size()-1;
		pila.remove(ultimo);
	}
	
	public String toString(){
		return "Elementos =" + pila;
	}

	public String top() {
		String retorno = null;
		for (int i=0; i < pila.size(); i++){
			retorno = pila.get(i);
		}
		return retorno;
	}

	public Pila copy() {
		Pila copia = new Pila();
		new ArrayList<>(pila);
		for (String Pila: pila){
			copia.push(Pila);
		}
		return copia;
	}

	public void reverse() {
		Collections.reverse(pila);
	}
	
}
