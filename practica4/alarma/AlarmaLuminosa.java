package alarma;
//import java.io.*;

public class AlarmaLuminosa extends Alarma{

	
	public AlarmaLuminosa (boolean vidrioRoto, boolean accesoAbierto, boolean movimiento){
		super(vidrioRoto, accesoAbierto, movimiento);
	}
	
	//Es necesario?
	public void comprobar(){
		super.comprobar();
	}
	
	public static void encenderLuz(){
			Luz.encender();
			Timbre.hacerSonar();
	}
	
}

	
