package alarma2;

import java.util.ArrayList;

public class Alarma {
	//creo que deberia ser public class Alarma extends Sensor.

	protected boolean sensorRuptura;
	protected boolean sensorApertura;
	protected boolean sensorMovimiento;
	ArrayList<Sensor> sensores = new ArrayList<>();
	//Es quiza así? ArrayList<String> sensores = new ArrayList<String>();

	
	
	
	public Alarma(){
		sensorRuptura = false;
		sensorApertura = false;
		sensorMovimiento = false;
		this.sensores = new ArrayList<Sensor>();

	}
	
	public Alarma(boolean ruptura, boolean apertura, boolean movimiento){
		this.sensorRuptura = ruptura;
		this.sensorApertura = apertura;
		this.sensorMovimiento = movimiento;
		
	}
	
	public void comprobar(){
		if (isSensorRuptura()||isSensorApertura()||isSensorMovimiento()){
			AlarmaLuminosa.encenderLuz();
		}else{
			error();
		}
	}

	public ArrayList<Sensor> getSensores() {
		return sensores;
	}

	public void setSensores(ArrayList<Sensor> sensores) {
		this.sensores = sensores;
	}

	public void setSensorRuptura(boolean sensorRuptura) {
		this.sensorRuptura = sensorRuptura;
	}

	public void agregarSensor(Sensor sensor){
		this.sensores.add(sensor);
	}

	public boolean isSensorRuptura() {
		return sensorRuptura;
	}

	public boolean isSensorApertura() {
		return sensorApertura;
	}

	public void setSensorApertura(boolean sensorApertura) {
		this.sensorApertura = sensorApertura;
	}

	public boolean isSensorMovimiento() {
		return sensorMovimiento;
	}

	public void setSensorMovimiento(boolean sensorMovimiento) {
		this.sensorMovimiento = sensorMovimiento;
	}

	private void error() {
		System.out.println("error");
		
	}



	
}
