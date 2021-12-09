package observerAlarma;

import java.util.Observable;

public class Represa extends Observable{

	double nivelAgua;
	
	
	
	public Represa(double nivel) {
		nivelAgua = nivel;
	}
	
	public void setNivelAgua(double agua) {
		double viejo = nivelAgua;
		nivelAgua = agua;
		this.setChanged();
		this.notifyObservers(viejo);
		
	}
	
	
	
	
}
