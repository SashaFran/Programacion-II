package empSoftware;

public class SueldoMensual extends CalcularSueldo {

	private int sueldo;
	private int horasExtra;
	
	public SueldoMensual(int s, int h){
		this.sueldo = s;
		this.horasExtra = h;
	}
	
	public int getSueldo() {
		return sueldo;
	}

	@Override
	public int sueldo() {
		return this.getSueldo();
	}

	@Override
	public int getHorasExtra() {
		return horasExtra;
	}

}
