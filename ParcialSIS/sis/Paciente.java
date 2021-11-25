package sis;

import java.util.ArrayList;

public class Paciente {

	private String nombre;
	private int edad;
	private ArrayList<String> sintomas;
	private ArrayList<String> equipamientoNecesario;
	
	
	public Paciente(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.sintomas = new ArrayList<>();
		this.equipamientoNecesario = new ArrayList<>();
	}
	

	public String getNombre() {
		return nombre;
	}


	public int getEdad() {
		return edad;
	}


	public ArrayList<String> getSintomas() {
		return new ArrayList<String>(sintomas);
	}


	public ArrayList<String> getEquipamientoNecesario() {
		return new ArrayList<String>(equipamientoNecesario);
	}
	
	public void addSintomas(String e){
		if(!sintomas.contains(e)){
			sintomas.add(e);
		}
	}
	
	public void addEquipamiento(String e){
		if(!equipamientoNecesario.contains(e)){
			equipamientoNecesario.add(e);
		}
	}


	public Paciente copia() {
		Paciente copia = new Paciente(this.nombre, this.edad);
		for (String req : equipamientoNecesario) {
			copia.addEquipamiento(req);
		}
		for (String sintoma : sintomas) {
			copia.addSintomas(sintoma);
		}
		return copia;
	}

	


}
