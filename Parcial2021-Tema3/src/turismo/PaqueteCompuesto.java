package turismo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import turismo.criterios.Criterio;

public class PaqueteCompuesto extends ElementosTurismo{

	private int id;
	private PaqueteSimple pa;
	private int cantMiembros;
	
	private ArrayList<ElementosTurismo> paquetes;
	

	public PaqueteCompuesto(int id, int cm){
		this.id = id;
		this.cantMiembros = cm;
		
	}
	
	@Override
	public String getOrigen() {
		for(ElementosTurismo e: paquetes)
			if (e.getOrigen() == pa.getDestino())
	}

	@Override
	public String getDestino() {
		
				
	}
	
	

	@Override
	public double getCosto() {
		double suma = 0;
		for (ElementosTurismo e: paquetes){
			suma += e.getCosto();
		}
		return suma; 
	}

	@Override
	public LocalDate fechaPago() {
		for(ElementosTurismo e: paquetes)
			if(e.fechaPago()!=null)
				e.fechaPago();
		return null;
	}

	@Override
	public int cantMiembros() {
		return this.cantMiembros;			
	}
	
	public boolean mismaCantidadMiembros(){
		int suma = 0;
		for (ElementosTurismo e: paquetes)
			suma += e.cantMiembros();
			if (this.cantMiembros  == suma)
				return true;
			else
				return false;
	}
	

	public int getId() {
		return id;
	}

	public ArrayList<ElementosTurismo> getPaquetes() {
		return paquetes;
	}
	
	public ArrayList<PaqueteSimple> paquetesxCriterio(Criterio c){
		ArrayList<PaqueteSimple> listaPaquetes = new ArrayList<>();
		for (ElementosTurismo e: paquetes)
			return super.paquetesxCriterio(c));
		return listaPaquetes;
	}
	
	

}
