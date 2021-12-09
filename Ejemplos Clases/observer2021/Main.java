package observer2021;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sensor s1 = new Sensor(10);
		Sensor s2 = new Sensor(10);
		Sensor s3 = s2;
		
		Estacion ss = new Estacion();
		
		ss.addSensor(s1);
		ss.addSensor(s2);
		ss.addSensor(s3);
		
		Dique dd = new Dique();
		dd.setNivelAgua(0);
		Alarma aa = new Alarma();
		
		aa.addSensor(s2);
		aa.addSensor(s1);
		aa.setDique(dd);
		System.out.println(ss.getRadiacion());
		
		s1.setRadiacion(100);
		
		
		System.out.println(ss.getRadiacion());
		s2.setRadiacion(170);
		
		System.out.println(ss.getRadiacion());
		
		dd.setNivelAgua(600);

	}

}
