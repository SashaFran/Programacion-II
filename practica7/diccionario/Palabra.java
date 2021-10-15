package diccionario;

import java.util.ArrayList;
import java.util.Collections;

public class Palabra implements Comparable<Palabra> {
	private String palabra;
	private String definicion;
	private ArrayList<String>sinonimos;
	private ArrayList<String>antonimos;
	
	public Palabra (String n,String definicion) {
		this.palabra=n;
		this.definicion=definicion;
		sinonimos= new ArrayList<>();
		antonimos= new ArrayList<>();
	}
	
	
	
	public void agregarSinonimo(String sino) {
		sinonimos.add(sino);
		Collections.sort(this.sinonimos);
	}
	

	public void agregarAntonimo(String anto) {
		antonimos.add(anto);
		Collections.sort(this.antonimos);
	}
	
	
	public String getPalabra() {
		return palabra;
	}



	public void setNombre_palabra(String palabra) {
		this.palabra = palabra;
	}



	public String getDefinicion() {
		return definicion;
	}



	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}


	

	public ArrayList<String> getSinonimos() {
		return (ArrayList<String>)sinonimos.clone();
	}




	public void setSinonimos(ArrayList<String> sinonimos) {
		this.sinonimos = sinonimos;
	}




	public ArrayList<String> getAntonimos() {
		return (ArrayList<String>)antonimos.clone();
	}




	public void setAntonimos(ArrayList<String> antonimos) {
		this.antonimos = antonimos;
	}

	
	public boolean equals(Object p) {
		try {
			Palabra comparar= (Palabra)p;
		return (this.getPalabra().equals(comparar.getPalabra()));
		}catch(Exception exc) { 
			return false;
		}
	}



	public int compareTo(Palabra x) {
		return this.getPalabra().toLowerCase().compareTo(x.getPalabra().toLowerCase());

	}

	
	public void modificarpalabra(Palabra p) {
		this.setDefinicion(p.getDefinicion());
		this.setAntonimos(p.getAntonimos());
		this.setSinonimos(p.getSinonimos());
	}


	@Override
	public String toString() {
		return "Palabra \nPalabra= " + this.getPalabra() + "\nDefinicion=" + this.getDefinicion() + "\nSinonimos=" + this.getSinonimos()
				+ "\nAntonimos=" + this.getSinonimos();
	}
	
	
}