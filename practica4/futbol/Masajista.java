package futbol;

import java.time.LocalDate;

public class Masajista extends Seleccion{
	
	private String titulo;
	private int añosExperiencia;
	
	public Masajista(String nombre, String apellido, int pasaporte, LocalDate fechadNac, char estado, String titulo, int añosExperiencia){
		super(nombre, apellido, pasaporte, fechadNac, estado);
		this.titulo = titulo;
		this.añosExperiencia = añosExperiencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAñosExperiencia() {
		return añosExperiencia;
	}
	
	public String toString(){
		return "Masajista: " +super.getNombre()+" "+super.getApellido()+"\nPasaporte: "+super.getPasaporte()+"\nEstado: "+super.getEstado()+"\nTitulo: "+ this.getTitulo()+"\nAños de experiencia: "+this.getAñosExperiencia()+"\nEsta disponible: "+super.isDisponible();
	}
	
	
}
