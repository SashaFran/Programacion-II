package observerAlarma;



import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class AlarmaCentral implements Observer{
  
	 ArrayList<Sensor> sensores;
	 double umbral;
	 Represa represa;
	 public AlarmaCentral(double um) {
		 sensores = new ArrayList<Sensor>();
		 umbral = um;
	 }
	 
	 public void setRepresa(Represa aa) {
		 aa.addObserver(this);
	 }
	 
	 
	 public void addSensorMonitorear(Sensor ss) {
		 sensores.add(ss);
		 ss.addObserver(this);
	 }


	
	public void dispararAlarma() {
		System.out.println("TODO MAL");
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		// ME AVISAN DE UN CAMBIO
	}
	
	 
	
}
