package observerCasero;
import java.util.ArrayList;

public class Alarma implements Interesado{
	
	ArrayList<Sensor> sensores;
	
	Dique dd;
	
	
   public Alarma() {
		super();
		sensores = new ArrayList<Sensor>();
	}

   public void setDique(Dique d1) {
	   dd = d1;
	   dd.addInteresada(this);
	   
   }
   
public void addSensor(Sensor ss) {
		
		if (!sensores.contains(ss)) {
			sensores.add(ss);
			ss.addInteresada(this); // ME INTERESA
	
		}
		
	}
	
	public void removeSensor(Sensor ss) {
		if (sensores.contains(ss) ) {
				sensores.remove(ss);
				ss.removeInteresada(this);
	
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
}
