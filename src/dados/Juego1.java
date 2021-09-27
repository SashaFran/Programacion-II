package dados;

public class Juego1 {
	private int puntosJugador1;
	private int puntosJugador2;

	private int cantidadCaras;
	private int cantidadRondas;
	private int minimoPuntos;
	
	 
	public Juego1() {
	  this(7,6,10);
		
	}
	

	
	public Juego1(int minimoPuntos) {
		this(minimoPuntos,6);
		
	}
	
	public Juego1(int minimoPuntos, int cantidadCaras) {
		this(minimoPuntos, cantidadCaras, 10);
	}
	

	
	public Juego1(int minimoPuntos, int cantidadCaras, int cantidadRondas) {
		this.puntosJugador1 = 0;
		this.puntosJugador2 = 0;
		
		this.minimoPuntos = minimoPuntos;
		this.cantidadCaras = cantidadCaras;
		this.cantidadRondas = cantidadRondas;
		
	}
	
	
	public int getPuntosJugador1() {
		return puntosJugador1;
	}
	
	public int getPuntosJugador2() {
		return puntosJugador2;
	}
	
	private int tirarDado() {
	
		// random entre
		//[0:1)---> [0:6) ---> [1:7) 1,0001  o 6,99999
		return  (int) ((Math.random()*cantidadCaras)+1);
	}
	
	public String ganador() {
		
		if (puntosJugador1 > puntosJugador2) {
			return "Jugador 1";
		} else if (puntosJugador2 > puntosJugador1) {
			return "Jugador 2";
		} else  {
			return "Empate";
		}
	}
	
	public String jugar() {
		int puntos1;
		int puntos2;
		for (int i =0; i<cantidadRondas; i++) {
			puntos1 = tirarDado() + tirarDado();
			puntos2 = this.tirarDado() + this.tirarDado();
			
			if ((puntos1 >= minimoPuntos)&&(puntos1>puntos2)) {
				puntosJugador1++;
			} else {
				if ((puntos2 >= minimoPuntos)&&(puntos2>puntos1)) {
					puntosJugador2++;
				}
			}
		}
		
		return this.ganador();
	}
}
