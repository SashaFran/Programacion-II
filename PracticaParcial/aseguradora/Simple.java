package aseguradora;

import java.util.ArrayList;
import java.util.Comparator;

import aseguradora.Filtro.Filtro;

public class Simple extends ElementoAseguradora {

	private int numeroPoliza, montoAsegurado;
	private String descripcion;
	
	public Simple(int dni, String nombreSeguro, int numeroPoliza, int montoAsegurado, String descripcion) {
		super(dni, nombreSeguro);
		this.numeroPoliza = numeroPoliza;
		this.montoAsegurado = montoAsegurado;
		this.descripcion = descripcion;
	}

	public int getNumeroPoliza() {
		return numeroPoliza;
	}
	public double getMontoAsegurado() {
		return montoAsegurado;
	}
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public ArrayList<Simple> cumple(Filtro f, Comparator<Simple> orden) {
		ArrayList<Simple> aux = new ArrayList<>();
		if(f.cumple(this)){
			aux.add(this);
		}
		return aux;
	}

}
