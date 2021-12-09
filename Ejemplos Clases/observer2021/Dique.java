package observer2021;

import java.util.Observable;

public class Dique extends Observable{

	double nivelAgua;

	public double getNivelAgua() {
		return nivelAgua;
	}

	public void setNivelAgua(double nievelAgua) {
		double valorViejo = this.nivelAgua;
		this.nivelAgua = nievelAgua;
		this.setChanged();
		this.notifyObservers(valorViejo);
	}
	
	
	
	
}
