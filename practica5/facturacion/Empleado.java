package facturacion;

public abstract  class Empleado {
	
	protected String nombre;
	protected String apellido;
	protected int DNI;
	protected int sueldoFijo;
	

	public Empleado(String nombre, String apellido, int DNI, int sueldoFijo){
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = DNI;
		this.sueldoFijo = sueldoFijo;
	}
	
	public abstract Double getSueldoMensual();
	public abstract String mostrar();

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

	public int getDNI() {
		return DNI;
	}

	public int getSueldoFijo() {
		return sueldoFijo;
	}

	public String toString(){
		return "Empleado: "+this.getNombre()+" "+this.getApellido()+"\nDNI: "+this.getDNI()+"\nsueldo mensual: "+this.getSueldoMensual() ;
		
	}


	

	
	
	
}
