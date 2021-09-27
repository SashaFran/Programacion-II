package dados;

public class Dado {


	private int cantidadCaras;
	private int ultimoValor;
	
	public Dado(int cantidad) {
		cantidadCaras = cantidad;
		ultimoValor = this.tirar();
	}
	
	public int tirar() {
		ultimoValor = (int)((Math.random()*cantidadCaras)+1);
		return  ultimoValor;
	}
	
	
	
	public int getUltimoValor() {
		return ultimoValor;
	}

	public static void main (String[] args) {
		
		Dado d1 = new Dado(6);
		
		for (int i =0 ; i<100; i++) {
			System.out.println(d1.tirar());
		}
		
		
	}

	public int getCantidadCaras() {
		return cantidadCaras;
	}

	public void setCantidadCaras(int cantidadCaras) {
		this.cantidadCaras = cantidadCaras;
	}
}
