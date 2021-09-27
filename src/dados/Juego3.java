package dados;

public class Juego3 {

	private Jugador jugador1;
	private Jugador jugador2;
	private int cantidadRondas;
	private int minimoPuntos;
    private cubilete cub; 	
    
	public Juego3(String n1, String n2, int cantidadRondas, int minimo, int cantidadCaras) {

		jugador1 = new Jugador(n1);
		jugador2 = new Jugador(n2);
		this.cantidadRondas = cantidadRondas;
		this.minimoPuntos = minimo;
		cub = new cubilete(2,cantidadCaras);
		
	}
	
	
	public Juego3(Jugador j1, Jugador j2, int cantidadRondas, int minimo, cubilete cub) {
		jugador1 = j1;
		jugador2 = j2;
		this.cantidadRondas = cantidadRondas;
		this.minimoPuntos = minimo;
		this.cub = cub;	
	}
	
	public int getPuntosJugador1() {
		return jugador1.getPuntos();
	}
	
	public Jugador getJugador1() {
		return jugador1;
	}
	
	public Jugador getJugador2() {
		return jugador2;
	}
	
	public int getPuntosJugador2() {
		return jugador2.getPuntos();
	}
	
		
	public Jugador ganador() {
		
		if (jugador1.getPuntos() > jugador2.getPuntos()) {
			return jugador1;
		} else if (jugador1.getPuntos() < jugador2.getPuntos()) {
			return jugador2;
		} else  {
			return null;
		}
	}
	
	public Jugador	jugar() {
		int puntos1;
		int puntos2;
		for (int i =0; i<cantidadRondas; i++) {
			puntos1 = jugador1.tirarDados(cub);
			puntos2 = jugador2.tirarDados(cub);;
			
			if ((puntos1 >= minimoPuntos)&&(puntos1>puntos2)) {
				jugador1.sumarPunto();
			} else {
				if ((puntos2 >= minimoPuntos)&&(puntos2>puntos1)) {
					jugador2.sumarPunto();
				}
			}
		}
		
		return this.ganador();
	}
	
	public static void main(String[] args) {
		Juego3 jj = new Juego3(new Jugador("Kevin"), new Jugador("Lucas"), 50, 7, new cubilete(50,6));
		Jugador ganador = jj.jugar();
		if (ganador != null) {
			System.out.println("Gano :" + ganador.getNombre() + " : " + ganador.getPuntos());
		} else {
			System.out.println("Empate");
		}
	}
	
}
