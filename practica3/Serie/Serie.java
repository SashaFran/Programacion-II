package Serie;


public class Serie {

	//private int cantidadTp;
	Temporada[] temporadas;
	String titulo, descripcion, creador, genero;
	int calificacion, punMin = 1, punMax = 5;
	
	public Serie(){
		
	}

	public Serie(int cantidadTp){
		temporadas = new Temporada[cantidadTp]; //Creo un arreglo de "cantidad temporadas" es el tamaño
		for(int i=0; i<temporadas.length; i++) {
			temporadas[i] = new Temporada(i);
		}
	}
	
	public Serie(String titulo, String descripcion, String creador, String genero){
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
	}
	
	public int getCantVisto(){
		int cantVisto = 0;
		for (int i= 0; i<temporadas.length; i++){
			cantVisto += temporadas[i].getEpisodiosVistos();
		}
		return cantVisto;
	}
	
	public Temporada[] getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(Temporada[] temporadas) {
		this.temporadas = temporadas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}


}
