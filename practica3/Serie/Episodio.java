package Serie;

public class Episodio extends Temporada{

	String titulo, descripcion;
	boolean flag;
	int calificacion;
	private int cantidadEp; 
	int punMin = 1;
	int punMax = 5;
	
	public Episodio(int cantidad){
		setCantidadEp(cantidad);
	}
	
	public Episodio(String titulo, String descripcion, int calificacion, boolean flag){
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.calificacion = calificacion;
		this.flag = flag;
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
	
	public boolean isFlag() {
		return flag;
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public int getCalificacion() {
		return calificacion;
	}
	
	public void setCalificacion(int calificacion) {
		//this.calificacion = calificacion;
		if (!flag){
			calificacion = -1;
		}else if((calificacion>=punMin)&&(calificacion<=punMax)){
			this.calificacion = calificacion;
		}else{
			System.out.println("numero ingresado no correcto");
			//que valor anterior debe quedar?
		}
			
	}

	public int getCantidadEp() {
		return cantidadEp;
	}

	public void setCantidadEp(int cantidadEp) {
		this.cantidadEp = cantidadEp;
	}
	
}
