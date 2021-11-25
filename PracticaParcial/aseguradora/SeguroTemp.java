package aseguradora;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import aseguradora.Filtro.Filtro;

public class SeguroTemp extends ElementoAseguradora {

	private LocalDate fInicio, fFin;
	private ElementoAseguradora seguro;
	
	public SeguroTemp(int dni, String nombre, LocalDate fInicio, LocalDate fFin, ElementoAseguradora seguro) {
		super(dni, nombre);
		this.seguro = seguro;
		this.fInicio = fInicio;
		this.fFin = fFin;
	}
	
	public boolean estaVigente(){
        LocalDate hoy = LocalDate.now();
        return hoy.compareTo(fInicio) > 0 && hoy.compareTo(fFin) < 0;
	}
	
	public double getMontoAsegurado() {
		if(estaVigente()){
			return seguro.getMontoAsegurado();
		}else
			return 0.0;
	}

	public LocalDate getfInicio() {
		return fInicio;
	}


	public void setfInicio(LocalDate fInicio) {
		this.fInicio = fInicio;
	}


	public LocalDate getfFin() {
		return fFin;
	}


	public void setfFin(LocalDate fFin) {
		this.fFin = fFin;
	}

	@Override
	public int getNumeroPoliza() {
		return seguro.getNumeroPoliza();
	}

	@Override
	public ArrayList<Simple> cumple(Filtro f, Comparator<Simple> orden) {
        if (estaVigente())
            return seguro.cumple(f, orden);
        return new ArrayList<>();
	}


}
