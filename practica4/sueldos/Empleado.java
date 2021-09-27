package sueldos;

//No importa las horas trabajadas
public class Empleado extends Empresa{
	
	private int sueldoFijo;
	

	
	public Empleado(){
		super();
		sueldoFijo = 15000;		
	}
	
	public int getSueldoFijo() {
		return sueldoFijo;
	}

	public void setSueldoFijo(int sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}

	public int getSalarioFinal(){
		return getSueldoFijo();
	}
	
	public String toString(){
		return "Empleado con un salario de: " + getSalarioFinal();
	}
}
