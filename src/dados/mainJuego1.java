package dados;

public class mainJuego1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Juego1 jj = new Juego1();
		Juego1 jj2 = new Juego1(3);
		Juego1 jj = new Juego1(9,11);
		
		
		
		System.out.println(jj.getPuntosJugador1());
		System.out.println(jj.getPuntosJugador2());
		
		System.out.println(jj.jugar());
		
		System.out.println(jj.getPuntosJugador1());
		System.out.println(jj.getPuntosJugador2());
		
	 	
	 
		
		System.out.println(jj2.getPuntosJugador1());
		System.out.println(jj2.getPuntosJugador2());
		
		System.out.println(jj2.jugar());
		
		System.out.println(jj2.getPuntosJugador1());
		System.out.println(jj2.getPuntosJugador2());
		
	}

}
