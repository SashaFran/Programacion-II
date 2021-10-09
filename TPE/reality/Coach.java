package reality;

import java.util.ArrayList;

public class Coach {

	private String nombre, apellido;
	private ArrayList<Participante> equipo;
	
	public Coach(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
		this.equipo = new ArrayList<Participante>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public ArrayList<Participante> getEquipo() {
		return new ArrayList<Participante>(equipo);
	}
	
	public void addAlEquipo(Participante pp){
		if (!equipo.contains(pp)){
			equipo.add(pp);
		}
	}
	
	/* Cada coach tiene un listado de participantes asignados como equipo propio. Cada coach desea poder obtener:
	un listado de todos los instrumentos que pueden tocar los participantes de su equipo (no
	debe haber repetidos)
	un listado de todos los idiomas que pueden cantar los participantes de su equipo (sin idiomas
	repetidos)
	un listado de géneros de preferencia de los participantes de su equipo (sin repetidos y
	ordenados alfabéticamente)
	El promedio de edad de su equipo*/
	
	
}
