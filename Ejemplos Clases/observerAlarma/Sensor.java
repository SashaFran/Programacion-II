package observerAlarma;


import java.util.Observable;

public class Sensor extends Observable{

	private double rad;


	


	public Sensor(double radiacion) {
		this.rad = radiacion;
	
	}

	public double getRadiacion() {
		return rad;
	}

	public void setRadiacion(double radiacion) {
//		double viejo = this.rad;
		this.rad = radiacion;
		this.setChanged();
		this.notifyObservers();
		
		
	}
	

	
	

	
	
}
