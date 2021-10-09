package SistemaAlquiler;


public class Pelicula extends ElementoAlquilado{
	
	private String nombre, director;
	private int estreno;
	private int cantCopias;
	
	public Pelicula(String nombre, String director, int estreno,int cantCopias){
		this.nombre = nombre;
		this.director = director;
		this.estreno = estreno;
		this.cantCopias = cantCopias;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDirector() {
		return director;
	}

	public int getCantCopias() {
		return cantCopias;
	}
	
	public int getEstreno() {
		return estreno;
	}
	
	public void devolucion(){
		this.cantCopias++;
	}
	
	public boolean isDisponible(){
		boolean disponible = false;
		if (cantCopias > 0){
			disponible = true;
		}else{
			disponible = false;
		}
		return disponible;
	}
	
	public void elementoAlquilado(){
		if (cantCopias > 0){
			this.cantCopias--;
		}
	}
	
	public String toString(){
		return "Pelicula: "+this.getNombre()+"\nDirector: "+this.getDirector()+"\nEstreno: "+this.getEstreno()+"\nCantidad de copias: "+this.getCantCopias();
	}

	@Override
	public String getElementoAlquilado() {
		return "Pelicula";
	}
	
	
}
