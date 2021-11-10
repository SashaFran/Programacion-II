package empSoftware;

public abstract class CalcularSueldo {

	public final int precioxHora = 120;
	
	public abstract int sueldo();
	public abstract int getHorasExtra();
	
	
	public int sueldoFinal(){
		int sueldoF = 0;
		if(this.getHorasExtra() > 0){
			sueldoF = this.sueldo()+(this.getHorasExtra()*precioxHora);
		}else{
			sueldoF = this.sueldo();
		}
		
		return sueldoF;
		
	}
	
}
