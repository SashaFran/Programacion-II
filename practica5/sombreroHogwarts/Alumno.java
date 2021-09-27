package sombreroHogwarts;

import java.util.ArrayList;
import java.util.List;

/*La Escuela Hogwarts de Magia y Hechicería decidió que era momento de reemplazar el
sombrero seleccionador en la tradicional ceremonia de comienzo de año y ahora requiere de
un sistema que permita realizar la asignación de alumnos a las diferentes casas. Cada una de
las casas cuenta con un conjunto de cualidades que deben tener los alumnos para poder
pertenecer a dicha casa y una cantidad máxima de alumnos que pueden aceptar. De esta
forma, si la casa se encuentra llena, ya no puede recibir nuevos alumnos. De un alumno se
conoce su nombre, su conjunto de cualidades y el conjunto de familiares que asisten a la
escuela. Para que una casa pueda aceptar a un nuevo alumno, además de haber lugar, el
alumno tiene que poseer todas las cualidades que la casa requiera. Es importante destacar que
los alumnos pueden ser asignados como máximo a una única casa.
Algunas casas no se contentan con que los alumnos tengan todas las cualidades que
requieren, sino que además en un afán de conservar los linajes de sangre pura, también
exigen que el alumno cuente con un familiar que pertenezca en este momento a la misma
casa. Y por último, hay casas que a lo largo de su historia se han encontrado enemistadas. En
el caso en el que la casa tenga una enemistad con otra, además de exigir al alumno tener todas
las cualidades, se debe controlar que dicho alumno no pueda ser aceptado por la casa
enemiga.*/

public abstract class Alumno extends Casa{

	private String nombre;
	private List<String> cualidadesAlumno;
	private ArrayList<Integer> cantFamiliares;
	protected boolean pertenece;
	
	public Alumno(String nombre) {
		super(nombre, cualidadesCasa);
		this.nombre = nombre;
		cualidadesAlumno = new ArrayList<String>();
		cantFamiliares = new ArrayList<Integer>();
		this.pertenece = pertenece;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Si alumno pertenece a casa, devolver true y nombre de casa
	//Si no pertenece a ninguna, devolver false
	public boolean isPertenece() {
		return pertenece;
	}

	public void setPertence(boolean pertence) {
		this.pertenece = pertence;
	}

	public List<String> getCualidadesAlumno() {
		return new ArrayList<String>();
	}

	public ArrayList<Integer> getCantFamiliares() {
		return new ArrayList<Integer>();
	}




	
}
