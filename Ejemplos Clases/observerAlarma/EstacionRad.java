package observerAlarma;


import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class EstacionRad implements Observer{

	ArrayList<Sensor> sensores;
	
	double suma;
	double promedio;
	
	public EstacionRad() {
		sensores = new ArrayList<Sensor>();
	}
	
	public double getRadiacionPromedio() {
		
		return promedio;
	}
	
	public void addSensor(Sensor ss) {
		sensores.add(ss);
		ss.addObserver(this);// AVISAME SI CAMBIAS! 
		suma = suma + ss.getRadiacion();
		promedio = suma / sensores.size();
	}
	
	

	
	
	
	public static void main(String[] args) {
		
		Sensor s1 = new Sensor(10);
		Sensor s2 = new Sensor(10);
		
		EstacionRad e1 = new EstacionRad();
		e1.addSensor(s1);
		e1.addSensor(s2);
		
		System.out.println(e1.getRadiacionPromedio());
		
		s1.setRadiacion(1000000);
		
		System.out.println(e1.getRadiacionPromedio());
		
		
		
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		//ACTUALIZAR EL VALOR
	}
}
