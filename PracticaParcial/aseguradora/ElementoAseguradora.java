package aseguradora;

import java.util.ArrayList;
import java.util.Comparator;

import aseguradora.Filtro.Filtro;

public abstract class ElementoAseguradora {

	private int dni;
	private String nombreSeguro;
	
	public ElementoAseguradora(int dni, String nombre) {
		this.dni = dni;
		this.nombreSeguro = nombre;
	}
	
	
	public abstract double getMontoAsegurado();
	public abstract int getNumeroPoliza();
	public abstract ArrayList<Simple> cumple(Filtro f, Comparator<Simple> orden);

	public int getDni() {
		return dni;
	}

	public String getNombreSeguro() {
		return nombreSeguro;
	}

	

	


	
	
}
