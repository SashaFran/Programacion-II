package alarma2;

public class Luz extends Alarma{

	//por si hay que crear un metodo de apagado, simplemente ponemos la tecla=false; y ya.
	private static boolean tecla = false;
	
	
	//why static?
	public static void encender(){
		setTecla(true);
		System.out.println("Luz encendida");
	}

	public static boolean isTecla() {
		return tecla;
	}

	public static void setTecla(boolean tecla) {
		Luz.tecla = tecla;
	}
	
}
