package futbol;

import java.time.LocalDate;

public class Entrenador extends Seleccion{

	private int idFederacion;
	
	public Entrenador(String nombre, String apellido, int pasaporte, LocalDate fechadNac, char estado, int idFederacion){
		super(nombre, apellido, pasaporte, fechadNac, estado);
		this.idFederacion = idFederacion;
	}

	public int getIdFederacion() {
		return idFederacion;
	}
	
	public String toString(){
		return "Masajista: " +super.getNombre()+" "+super.getApellido()+"\nPasaporte: "+super.getPasaporte()+"\nEstado: "+super.getEstado()+"\nId de Federacion: "+this.getIdFederacion()+"\nEsta disponible: "+super.isDisponible();
	}

	
}
