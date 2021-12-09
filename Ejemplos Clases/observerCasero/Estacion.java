package observerCasero;

import java.util.ArrayList;

public class Estacion implements Interesado{

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
			ss.addInteresada(this); // ME INTERESA
			suma = suma + ss.getRadiacion();
		}
		
	}
	
	public void removeSensor(Sensor ss) {
		if (sensores.contains(ss) ) {
				sensores.remove(ss);
				ss.removeInteresada(this);
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
	
	
	public void avisarCambio(double valorViejo, ElementoObservado ss) {
		suma = suma - valorViejo + ((Sensor)ss).getRadiacion();
		cambio =(Sensor)ss;
	}
	
	
}
