package observer2021;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Alarma implements Observer{
	
	ArrayList<Sensor> sensores;
	
	Dique dd;
	
	
   public Alarma() {
		super();
		sensores = new ArrayList<Sensor>();
	}

   public void setDique(Dique d1) {
	   dd = d1;
	   dd.addObserver(this);
	   
   }
   
public void addSensor(Sensor ss) {
		
		if (!sensores.contains(ss)) {
			sensores.add(ss);
			ss.addObserver(this); // ME INTERESA
	
		}
		
	}
	
	public void removeSensor(Sensor ss) {
		if (sensores.contains(ss) ) {
				sensores.remove(ss);
				ss.deleteObserver(this);
	
		}
	}
	
	public void avisarCambio(double valorViejo, ElementoObservado ss) {
		this.controlarAlarma();
	}
	
	public void controlarAlarma() {
		for(int i = 0; i<sensores.size();i++) {
			if(sensores.get(i).getRadiacion()>180) {
				System.out.println("CORRAN CORRAN RADIACION");
			}
		}
		if (dd!=null && dd.getNivelAgua()>500) {
			System.out.println("CORRAN CORRAN SE VIENE EL AGUA");
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		this.controlarAlarma();
		
	}
}
