package alarma2;

public class MainAlarma {

	public static void main(String[] args){
		
		Sensor s1 = new Sensor("Living");
		
		Alarma a1 = new Alarma();
		a1.agregarSensor(s1);
		a1.comprobar();
		a1.getSensores();
		//a1.getSensores().get(1).getZona();
		//como conseguir la cantidad de sensores?
		System.out.println(a1);
	}
}
