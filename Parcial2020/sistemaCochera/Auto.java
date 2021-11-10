package sistemaCochera;

import java.util.ArrayList;

public class Auto {
	private String marca;
	private int modelo;
	private ArrayList<String> caracteristicas;
	private ArrayList<String> facilidades;
	
	
	
	public Auto(String marca, int modelo){
		this.marca = marca;
		this.modelo = modelo;
		this.caracteristicas = new ArrayList<>();
		this.facilidades = new ArrayList<>();
	}



	public String getMarca() {
		return marca;
	}



	public int getModelo() {
		return modelo;
	}
	
	
	public boolean cumpleFacilidad(String facilidad) {
		
		return this.facilidades.contains(facilidad);
	}
	
	
	public boolean cumpleCaracteristica(String caracteristica) {
		return this.caracteristicas.contains(caracteristica);
	}

	
}
