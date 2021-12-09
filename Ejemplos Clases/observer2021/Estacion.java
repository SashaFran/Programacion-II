package observer2021;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Estacion implements Observer{

	ArrayList<Sensor> sensores;
	double suma; 
	Sensor cambio;

	public Estacion() {
		super();
		sensores = new ArrayList<Sensor>();
		suma =0;
	}
	
	
	public void addSensor(Sensor ss) {
		if (!sensores.contains(ss)) {
			sensores.add(ss);
			ss.addObserver(this); // ME INTERESA
			suma = suma + ss.getRadiacion();
		}
		
	}
	
	public void removeSensor(Sensor ss) {
		if (sensores.contains(ss) ) {
				sensores.remove(ss);
				ss.deleteObserver(this);
				suma = suma - ss.getRadiacion();
		}
	}
	
	public double getRadiacion() {
		if (sensores.size()==0) {
			return 0;
		} else {
		  return  suma / sensores.size();
		}
	}
	



	@Override
	public void update(Observable o, Object arg) {
		suma = 0;
		for(int i =0; i<sensores.size();i++) {
			suma = suma + sensores.get(i).getRadiacion();
		}
		
		
		cambio =(Sensor)o;
		
	}
	
	
}
