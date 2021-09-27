package persona;
import java.time.LocalDate;

public class Persona {
	int edad, DNI;
	String nombre, apellido;
	char sexo;
	Double peso, altura;
	LocalDate fechadNac;
	
	public Persona(){
		fechadNac = LocalDate.of(2000,01,01);
		sexo = 'f';
		nombre = "N";
		apellido = "N";
		peso = 1.0;
		altura = 1.0;
	}
	
	public Persona(int DNI){
		this.DNI = DNI;
		//Constructor para que ingrese el DNI
		fechadNac = LocalDate.of(2000,01,01);
		sexo = 'f';
		nombre = "N";
		apellido = "N";
		peso = 1.0;
		altura = 1.0;
	}
	public Persona(int DNI, String nombre, String apellido){
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellido = apellido;
		//Constructor para ingresar DNI, apellido y nombre.
		fechadNac = LocalDate.of(2000,01,01);
		sexo = 'f';
		peso = 1.0;
		altura = 1.0;
	}
	
	public Persona(int DNI, String nombre, String apellido, LocalDate fechadNac){
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechadNac = fechadNac;
		//Constructor para ingresar nombre, apellido, fecha de nacimiento, dni
		sexo = 'f';
		peso = 1.0;
		altura = 1.0;
	}
	
	//No pasar por parametro peso u altura porque ya lo pide en el constructor
	public Double getmasaCorporal(){
		return peso/altura*altura; 
	}
	
	//No se si pasar por parametro el forma o dejarlo asi.
	//controla el estado fisico de la persona y devuelve verdadero o falso.
	public boolean estadoFisico (){
		Double forma = getmasaCorporal();
		if ((forma > 18) && (forma < 25)){
			return true;
		}else{
			return false;	
		}
	}
	
	public boolean cumpleaños(){
		LocalDate FechaHoy = LocalDate.now();
		//checkea el mes actual y lo compara con el de nacimiento
		//Checkea el dia actual y lo compora con el de nacimiento
		if (FechaHoy.getMonthValue() == fechadNac.getMonthValue() && FechaHoy.getDayOfMonth() ==  fechadNac.getDayOfMonth()){
			return true;
		}else{
			//Si al checkear no encuentro nada, da falso y ya.
			return false;
		}
	 }
	
	public boolean mayordEdad(){
		edad = getEdad();
		if (edad >= 18){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean edadVoto(){
		edad = getEdad();
		if (edad >= 16){
			return true;
		}else {
			return false;
		}
	}
	
	public boolean coherencia(int edad){
		edad = getEdad();
		LocalDate FechaHoy = LocalDate.now();
		int anio = ((fechadNac.getYear()) - (FechaHoy.getYear()));
		if (FechaHoy.getMonthValue() < fechadNac.getMonthValue()){
			edad--;
		}if (edad == anio){
			return true;
		}else{
			return false;
		}
	}
	
	
	public int getEdad() {
		LocalDate FechaHoy = LocalDate.now();
		edad = ((FechaHoy.getYear()) - (fechadNac.getYear()) );
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	public LocalDate getFechadNac() {
		return fechadNac;
	}
	public int getDNI() {
		return DNI;
	}
	
	

}
