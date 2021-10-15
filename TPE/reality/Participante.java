package reality;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

//equals 

public class Participante {

	private String nombre, apellido;
	//private int edad;
	private LocalDate fechaDeNacimiento;
	private ArrayList<String> generosFav;
	private ArrayList<String> instrumentos;
	private ArrayList<String> idiomas;
	
	
	public Participante(String nombre, String apellido, LocalDate nacimiento){
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = nacimiento;
		generosFav = new ArrayList<>();
		instrumentos = new ArrayList<>();
		idiomas = new ArrayList<>();
	}
	
	//Lo hice asi porque de esta forma es actualizable a traves del tiempo
	public int getEdad(){
		LocalDate ahora = LocalDate.now();
	    Period periodo = Period.between(fechaDeNacimiento, ahora);
	    return periodo.getYears();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public ArrayList<String> getGenerosFav() {
		return new ArrayList<String>(generosFav);
	}

	public ArrayList<String> getInstrumentos() {
		return new ArrayList<String>(instrumentos);
	}
	
	public void addGenero(String gf){
		if (generosFav.contains(gf)){
			generosFav.add(gf);
		}
	}
	
	public void addInstrumento(String i){
		if (!instrumentos.contains(i)){
			instrumentos.add(i);
		}
	}
	
	public void addIdioma(String idi){
		if (!idiomas.contains(idi)){
			idiomas.add(idi);
		}
	}
	
	public String toString(){
		return "Participante: "+ this.getNombre()+" "+this.getApellido()+"\nEdad: "+this.getEdad();
	}
	
}
