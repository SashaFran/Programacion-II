package gastosPublicos;

import java.util.ArrayList;

public class Ciudad extends Provincia{

	private String nombreCiudad;
	private ArrayList<Contribuyente> contribuyentes;
	protected int cantHabitantes;
	protected int gastosMantenimiento;
	
	
	public Ciudad(String nombreProv, String nombrePais, String nombreCiudad){
		super(nombreProv, nombrePais);
		this.nombreCiudad = nombreCiudad;
		contribuyentes = new ArrayList<Contribuyente>();
	}


	public ArrayList<Contribuyente> getContribuyentes() {
		return new ArrayList<Contribuyente>();
	}

	public int getCantHabitantes() {
		int cant = 0;
			for (Contribuyente c: contribuyentes){
				cant++;
			}
			return cant;
	}
	
	public void getTotalRecaudado(){
		for (Contribuyente c: this.contribuyentes){
			System.out.println(c.mostrar());
		}
	}

	public void setCantHabitantes(int cantHabitantes) {
		this.cantHabitantes = cantHabitantes;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	
	public void addContribuyente(Contribuyente c){
		contribuyentes.add(c);
	}
	
	
	
	
	
	
	
	
}
