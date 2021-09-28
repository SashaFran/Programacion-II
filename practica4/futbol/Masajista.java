package futbol;

import java.time.LocalDate;

public class Masajista extends Seleccion{
	
	private String titulo;
	private int a�osExperiencia;
	
	public Masajista(String nombre, String apellido, int pasaporte, LocalDate fechadNac, char estado, String titulo, int a�osExperiencia){
		super(nombre, apellido, pasaporte, fechadNac, estado);
		this.titulo = titulo;
		this.a�osExperiencia = a�osExperiencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getA�osExperiencia() {
		return a�osExperiencia;
	}
	
	public String toString(){
		return "Masajista: " +super.getNombre()+" "+super.getApellido()+"\nPasaporte: "+super.getPasaporte()+"\nEstado: "+super.getEstado()+"\nTitulo: "+ this.getTitulo()+"\nA�os de experiencia: "+this.getA�osExperiencia()+"\nEsta disponible: "+super.isDisponible();
	}
	
	
}
