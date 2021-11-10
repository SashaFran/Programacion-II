package empSoftware;



public class SueldoxHora extends CalcularSueldo {

	private int sueldoxHora;
	private int cantHorasTrabajadas;
	private int horasExtra;
	
	public SueldoxHora(int cantHorasTrabajadas, int h){
		this.cantHorasTrabajadas = cantHorasTrabajadas;
		this.sueldoxHora = 140;
		this.horasExtra = h;
	}
	
	@Override
	public int sueldo() {
		return (this.getCantHoras()*this.getSueldoxHora());
	}

	public int getCantHorasTrabajadas() {
		return cantHorasTrabajadas;
	}

	@Override
	public int getHorasExtra() {
		return horasExtra;
	}

	public int getSueldoxHora() {
		return sueldoxHora;
	}

	public int getCantHoras() {
		return cantHorasTrabajadas;
	}


}
