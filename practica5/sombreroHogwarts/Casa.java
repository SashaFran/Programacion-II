package sombreroHogwarts;

import java.util.ArrayList;
import java.util.List;

public abstract class Casa extends Hogwarts{

	protected static final Integer MAX = 15;	
	private String nombre; //Nombre de la casa
	protected ArrayList<Alumno> alumnos;
	protected static ArrayList<String> cualidadesCasa;
	private Integer maximo;
	
	public Casa(String nombre, ArrayList<String> cualidadesCasa){
		this.nombre = nombre;
		cualidadesCasa = new ArrayList<String>();
		alumnos = new ArrayList<Alumno>();
		maximo = MAX;
	}

	//solo lo agrega si no supera la cantidad maxima
	//si tiene las mismas cualidades de la casa.
	//Si el alumno no tiene casa.
	//Si va a Slytherin, debe ser sangre pura.
	public void addAlumno(Alumno alumno){
		if(alumnos.contains(alumno)){
			System.out.println("El alumno contiene casa");
		}else{
			alumnos.add(alumno);
		}
		
	}
	
	//Compara las cualidades de la casa con el alumno.
	//Tiene familiar en la misma casa.
	public abstract boolean compare();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getMaximo() {
		return maximo;
	}

	public void setMaximo(Integer maximo) {
		this.maximo = maximo;
	}

	public static Integer getMax() {
		return MAX;
	}

	public List<String> getCualidadesCasa() {
		return new ArrayList<String>();
	}

	public List<Alumno> getAlumnos() {
		return new ArrayList<Alumno>();
	}
	
	
}