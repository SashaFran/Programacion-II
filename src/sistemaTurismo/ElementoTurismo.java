package sistemaTurismo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import sistemaTurismo.Criterio;
public abstract class ElementoTurismo {

	private int identificador, cantPasajeros;
	private String nombre;
	
	public ElementoTurismo(int identificador, String nombre, int cantPasajeros) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.cantPasajeros = cantPasajeros;
	}

	public abstract String getOrigen();
	public abstract String getDestino();
	public abstract double getCosto();
	public abstract LocalDate getFechaPago();
	


	public abstract ArrayList<ElementoTurismo> buscar(Criterio c);
	
	public ArrayList<ElementoTurismo> buscar(Criterio c, Comparator<ElementoTurismo> c1){
		ArrayList<ElementoTurismo> aux = this.buscar(c);
		Collections.sort(aux, c1);
		return aux;
		
	}
	
	public int getIdentificador() {
		return identificador;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getCantPasajeros() {
		return cantPasajeros;
	}

	public void setCantPasajeros(int cantPasajeros) {
		this.cantPasajeros = cantPasajeros;
	}
	
	
}
	
	
	

