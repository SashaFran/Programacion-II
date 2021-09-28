package gastosPublicos;
import java.util.ArrayList;
/*
 * - Monto recaudado por ciudad.
 * - Gastos por ciudad (mantenimiento).
 * - Quien gasta mas que lo recaudado (ciudad)
 * - Provincia con mas de la mitad de ciudades en deficit.
 */

public class Pais {

	protected String nombrePais;
	private ArrayList<Ciudad> ciudades;
	protected ArrayList<Provincia> provincias;
	
	public Pais(String nombrePais){
		this.nombrePais = nombrePais;
		this.ciudades = new ArrayList<Ciudad>();
		this.provincias = new ArrayList<Provincia>();
	}
	
	//Se saca el montototal de las ciudades y
	//se busca el que mas gasta.
	public void montoTotal(){
		for (int i=0; i<ciudades.size(); i++){
			
		}
	}

	public ArrayList<Ciudad> getCiudades() {
		return new ArrayList<Ciudad>();
	}

	public ArrayList<Provincia> getProvincias() {
		return new ArrayList<Provincia>();
	}
	
	public void addProvincias(Provincia p){
		this.provincias.add(p);
	}
	
	public void addCiudades(Ciudad c){
		this.ciudades.add(c);
	}

	public String getNombrePais() {
		return nombrePais;
	}
	
	
	
	
	
	
	
	
	
}
