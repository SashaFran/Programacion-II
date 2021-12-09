package observerFileSystem;

public class Archivo extends ElementoFS {

	String nombre;
	
	
	public Archivo(String nombre, double tam) {
		super();
		this.nombre = nombre;
		this.tam = tam;
		
		
	}
	


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTam(double tam) {
		double viejo = this.tam;
		this.tam = tam;
		if (viejo!=tam) {
	   	  this.setChanged();
		  this.notifyObservers();
		}
	}
	
	
	
}
