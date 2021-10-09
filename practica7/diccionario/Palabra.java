package diccionario;

public class Palabra {
	
	private String palabra;
	private String funcion;
	private String antonimo;
	private String sinonimo;
	private String definicion;
	
	public Palabra(String palabra, String funcion, String definicion, String antonimo, String sinonimo){
		this.palabra = palabra;
		this.funcion = funcion;
		this.definicion = definicion;
		this.antonimo = antonimo;
		this.sinonimo = sinonimo;
	}

	public String getPalabra() {
		return palabra;
	}
	
	public String getFuncion() {
		return funcion;
	}
	
	public String getAntonimo() {
		return antonimo;
	}

	public String getSinonimo() {
		return sinonimo;
	}

	public String getDefinicion() {
		return definicion;
	}

	public String toString(){
		return "Palabra: " + this.getPalabra()+" Funcion gramatical: "+this.getFuncion();
	}
	

	

	
}
