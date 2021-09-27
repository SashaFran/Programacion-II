package sueldos;

//Sueldo fijo + extra
public class EmpleadoExtra extends Empleado{
	
	private int horasExtras;
	private int precioHora;
	private int precioxHora;

	
	public EmpleadoExtra(){
		super();
	}
	
	public EmpleadoExtra(int horasExtra){
		this.horasExtras = horasExtra;
		this.precioxHora = 100; //gana $100 por hora extra laburada
	}
	
	//Da el salario final de cada empleado que trabaje horas extras.
	public int getSalarioFinal(){
		return ((getPrecioxHora() * getHorasExtras()) + super.getSueldoFijo());
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public int getPrecioHora() {
		return precioHora;
	}

	public int getPrecioxHora() {
		return precioxHora;
	}

	public void setPrecioxHora(int precioxHora) {
		this.precioxHora = precioxHora;
	}
	
	public String toString(){
		return "Empleado extra con un salario de: " + this.getSalarioFinal();
	}

	
}