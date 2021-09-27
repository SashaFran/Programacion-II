package alarma;

public class Alarma {
	//creo que deberia ser public class Alarma extends Sensor.

	protected boolean vidrioRoto;
	protected boolean accesoAbierto;
	protected boolean movimiento;
	
	public Alarma(){
		vidrioRoto = false;
		accesoAbierto = false;
		movimiento = false;
	}
	
	public Alarma(boolean vidrioRoto, boolean accesoAbierto, boolean movimiento){
		this.vidrioRoto = vidrioRoto;
		this.accesoAbierto = accesoAbierto;
		this.movimiento = movimiento;
		
	}
	
	public void comprobar(){
		if ((this.vidrioRoto == true)||(this.accesoAbierto == true)||(this.movimiento == true)){
			AlarmaLuminosa.encenderLuz();
		}else{
			
		}
	}

	public boolean isVidrioRoto() {
		return vidrioRoto;
	}

	public void setVidrioRoto(boolean vidrioRoto) {
		this.vidrioRoto = vidrioRoto;
	}

	public boolean isAccesoAbierto() {
		return accesoAbierto;
	}

	public void setAccesoAbierto(boolean accesoAbierto) {
		this.accesoAbierto = accesoAbierto;
	}

	public boolean isMovimiento() {
		return movimiento;
	}

	public void setMovimiento(boolean movimiento) {
		this.movimiento = movimiento;
	}
}
