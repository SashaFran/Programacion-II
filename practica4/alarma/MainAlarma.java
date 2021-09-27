package alarma;

public class MainAlarma {

	public static void main(String[] args){
		
		Alarma alarma1 = new Alarma(true, false, false);
		
		System.out.println("Esta abierto? "+ alarma1.isAccesoAbierto()+"\nEsta roto? "+ alarma1.vidrioRoto+"\nHay movimiento? "+ alarma1.movimiento);
		
		
	}
}
