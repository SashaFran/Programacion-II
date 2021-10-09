package SistemaAlquiler;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empresa{

	private String nombreEmpresa;
	protected ArrayList<Cliente> clientes;
	protected ArrayList<ElementoAlquilado> elementos;
	
	
	public Empresa(String nombreEmpresa){
		this.clientes = new ArrayList<Cliente>();
		this.elementos = new ArrayList<ElementoAlquilado>();
		this.nombreEmpresa = nombreEmpresa;
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}



	public void addCliente(Cliente c){
		clientes.add(c);
	}
	
	public ArrayList<Cliente> getClientes() {
		return new ArrayList<Cliente>(clientes);
	}

	public ArrayList<ElementoAlquilado> getElementos() {
		return new ArrayList<ElementoAlquilado>(elementos);
	}

	public void addElemento(ElementoAlquilado e){
		for (int i=0; i < elementos.size(); i++){
			if(!this.elementos.get(i).equals(e)){
				elementos.add(e);
			}
		}
	}
	
	public void alquilarElemento (ElementoAlquilado e, Cliente c){
		LocalDate hoy = LocalDate.now();
		if (e.isDisponible()){
			e.elementoAlquilado();
			Alquiler nuevo = new Alquiler(c,e,hoy);
			c.addAlquiler(nuevo);
		}else{
			System.out.println("Alquiler no disponible");
		}
	}
	
	
}
