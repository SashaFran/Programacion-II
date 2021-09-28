package futbol;

import java.time.LocalDate;
import java.util.ArrayList;

public class Seleccion{

	String nombre, apellido;
	int pasaporte;
	LocalDate fechadNac;
	private char estado; // V = viajando, C = en concentracion, P = pais de origen.
	private boolean disponible;
	protected ArrayList<Futbolista> futbolistas;
	protected ArrayList<Masajista> masajistas;
	protected ArrayList<Entrenador> entrenadores; 

	

	public Seleccion(){
		futbolistas = new ArrayList<Futbolista>();
		masajistas = new ArrayList<Masajista>();
		entrenadores = new ArrayList<Entrenador>();
		
	}
	
	public Seleccion(String nombre, String apellido, int pasaporte, LocalDate fechadNac, char estado){
		this.nombre = nombre;
		this.apellido = apellido;
		this.pasaporte = pasaporte;
		this.fechadNac = fechadNac;
		this.estado = estado;
	}

	public ArrayList<Futbolista> getFutbolistas() {
		return new ArrayList<Futbolista>(futbolistas);
	}

	public ArrayList<Masajista> getMasajistas() {
		return new ArrayList<Masajista>(masajistas);
	}

	public ArrayList<Entrenador> getEntrenador() {
		return new ArrayList<Entrenador>(entrenadores);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechadNac() {
		return fechadNac;
	}

	public void setFechadNac(LocalDate fechadNac) {
		this.fechadNac = fechadNac;
	}

	public int getPasaporte() {
		return pasaporte;
	}
	
	public boolean isDisponible() {
		if ((getEstado() == 'P')&&(getEstado() != 'C')&&(getEstado() != 'V')){
			disponible = true;
		}else{
			disponible = false;
		}
		return disponible ;
	}
	
	public char getEstado() {
		return estado;
	}
	
	public void addFutbolista(Futbolista ff){
		for (int i=0; i<futbolistas.size(); i++){
			futbolistas.add(ff);
		}
	}
	
	public void addMasajista(Masajista mm){
		for (int i=0; i<masajistas.size(); i++){
			masajistas.add(mm);
		}
	}
	
	public void addEntrenador(Entrenador ee){
		for (int i=0; i<entrenadores.size(); i++){
			entrenadores.add(ee);
		}
	}
	
	
}
