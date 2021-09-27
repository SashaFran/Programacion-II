package Serie;

/*
 * Array episodios
 * - La cantidad de episodios vistos
 * - Promedio de episodios vistos por temporada
 */

public class Temporada extends Serie{
	
	private Episodio[]  episodios;
	Episodio e1 = new Episodio(6);

	public Temporada(int cantidadEp) {
		episodios = new Episodio[cantidadEp]; //Creo un arreglo
		//de "cantidadDados" es el tamaño
		//dados.length == cantidadDados
		for(int i=0; i< episodios.length; i++) {
			episodios[i] = new Episodio(6);
		}
	}
	
	public Temporada(){
		//me pedia hacerlo pero no se que ponerle.
	}
	
	public int getEpisodiosVistos() {
		int cantVistos = 0;
		for (int i = 0; i < episodios.length; i++) {
			if(episodios[i].isFlag()) {
				cantVistos++;		
			}
		}
		return cantVistos;
	}
	
	public Double promedioTp(){
		int suma = 0;
		int episodiosCalificados = 0;
		for (int i=0; i<episodios.length; i++){
			if(e1.getCalificacion()>0){
				suma+= e1.getCalificacion();
				episodiosCalificados++;
			}
		}
		return (double) (suma/episodiosCalificados);
	}


	public Episodio[] getEpisodios() {
		return episodios;
	}

	public void setEpisodios(Episodio[] episodios) {
		this.episodios = episodios;
	}
}
