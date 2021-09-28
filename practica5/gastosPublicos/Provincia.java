package gastosPublicos;

import java.util.ArrayList;

public class Provincia extends Pais{
	
	protected String nombreProv;
	private int min;
	protected ArrayList<Ciudad> ciudades;
	protected ArrayList<Ciudad> ciudadesControl;

	public Provincia(String nombreProv, String nombrePais) {
		super(nombrePais);
		this.nombreProv = nombreProv;
		min = 100000;
	}
	
	public void ciudadesControl(){
		for (Ciudad c: ciudades){
			if(c.getCantHabitantes() > min){
				ciudadesControl.add(c);
			}
		}
	}

	public String getNombreProv() {
		return nombreProv;
	}

	public ArrayList<Ciudad> getCiudades() {
		return new ArrayList<Ciudad>();
	}

	public ArrayList<Ciudad> getCiudadesControl() {
		return new ArrayList<Ciudad>();
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}
	
	
	
	
	
	

}
