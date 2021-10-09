package SistemaAlquiler;

import java.util.ArrayList;

/*
 * funcionalidad necesaria para permitir conocer quiénes son los
	clientes que poseen alquileres vencidos.
 */
public class Cliente {

	String nombre, apellido;
	private int dni;
	private ArrayList<Alquiler> alquileres;
	
	public Cliente(String nombre, String apellido, int dni){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		alquileres = new ArrayList<Alquiler>();
	}
	
	public int getDni() {
		return dni;
	}

	public ArrayList<Alquiler> getAlquileres() {
		return new ArrayList<Alquiler>(alquileres);
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public void addAlquiler(Alquiler a){
		alquileres.add(a);
	}
	
	public boolean elementosVencidos(){
		boolean devuelto = false;
		for(int i=0; i < alquileres.size(); i++){
			if(alquileres.get(i).isVencido()){
				devuelto = true;
			}else{
				devuelto = false;
			}
		}
		return devuelto;
	}
	
	public void vueltaElementoAlquilado(ElementoAlquilado e){
		e.devolucion();
	}
	
	@Override
	public String toString(){
		return this.getNombre()+" "+this.getApellido()+"\nDNI: "+this.getDni();
	}

	
	
	
	

}
