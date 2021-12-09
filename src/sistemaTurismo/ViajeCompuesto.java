package sistemaTurismo;

import java.time.LocalDate;
import java.util.ArrayList;

public class ViajeCompuesto extends ElementoTurismo{

	private ArrayList<ElementoTurismo> elementos;
	
	public ViajeCompuesto(int identificador, String nombre,int cantPasajeros) {
		super(identificador, nombre, cantPasajeros);
		this.elementos = new ArrayList<>();
	}
	
	public void addElementos(ElementoTurismo e){
		//Si la cantidad es igual
		if(this.getCantPasajeros() == e.getCantPasajeros()){
			if (elementos.size() == 0) {
				elementos.add(e);
			} else {
				//Si el destino es igual al origen.
				if (this.getDestino().equals(e.getOrigen()))
					elementos.add(e);
			}
		}
	}
	
	@Override
	public ArrayList<ElementoTurismo> buscar(Criterio c) {
		ArrayList<ElementoTurismo> aux = new ArrayList<>();
		if(c.cumple(this))
			aux.add(this);
		else
			for(ElementoTurismo e: elementos)
				aux.addAll(e.buscar(c));
		return aux;
	}

	@Override
	public double getCosto() {
		double total = 0;
		for(ElementoTurismo e: elementos)
			total += e.getCosto();
		return total;
	}

	@Override
	public String getOrigen() {
		if (!elementos.isEmpty())
			 return elementos.get(0).getOrigen();
		else
			return null;
	}

	@Override
	public String getDestino() {
		int size = elementos.size();
		if( size > 0)
			return elementos.get(size-1).getDestino();
		else
			return null;
	}

	@Override
	public LocalDate getFechaPago() {
		LocalDate mayor =  LocalDate.of(1900, 1,1);
		for(int i=0; i<elementos.size();i++) {
			ElementoTurismo elementoI = elementos.get(i);
			LocalDate fecha = elementoI.getFechaPago();
			if (fecha==null) {
				return null;
			} else {
				if (fecha.compareTo(mayor)>0)
					mayor = fecha;
			}
		}
		return mayor; 
	}

}
