package sujetos;

import java.time.LocalDate;
import java.util.ArrayList;
import filtros.Filtro;

public class Contingencia extends ElementoEgreso{
	
	protected ArrayList<ElementoEgreso> pasajeros; 
	private Filtro f1;
	
	public Contingencia(String nombre, String destino, LocalDate fechaPartida, LocalDate fechaRegreso, double deuda) {
		super(nombre, destino, fechaPartida, fechaRegreso, deuda);
		this.pasajeros = new ArrayList<>();
	}

	public void setPasajeros(ElementoEgreso e) {
		//AGREGA UN PASAEJERO BAJO CONDICION.
		if(f1.cumple(e))
			this.pasajeros.add(e);
	}
	
	@Override
	public double getDeuda() {
		//RETORNA LA DEUDA TOTAL DE LOS PASAJEROS.
		double deudaTotal = 0;
		for(ElementoEgreso e:pasajeros) {
			deudaTotal += e.getDeuda();
		}
		return deudaTotal;
	}

	@Override
	public int cantPasajeros() {
		//RETORNA LA CANTIDAD TOTAL DE PASAJEROS
		int cantPasajeros = 0;
		for(ElementoEgreso e:pasajeros) {
			cantPasajeros += e.cantPasajeros();
		}
		return cantPasajeros;
	}

	public boolean tieneElementos() {
		//DEVUELVE TRUE SI AUN TIENE ELEMENTOS Y FALSE SI NO
		return !pasajeros.isEmpty();
	}
	
//-------------------------------------------------------
	@Override
	public Pasajero mayorDeudor() {
		//RETORNA EL PASAJERO CON MAYOR DEUDA.
		double deudaMayor = 0; //auxiliar que guarda la mayor deuda.
		Pasajero deudor = null;//auxiliar que guarda el mayor deudor
		
		for(ElementoEgreso e:pasajeros) { //recorro mi lista de hijos
			Pasajero deudorParcial = e.mayorDeudor(); //solicito que hagan lo mismo que yo 
			
			if(deudorParcial!=null) {// si mi hijo es !=null
				double deudaParcial = deudorParcial.getDeuda(); //obtengo su deuda
				if(deudaParcial>deudaMayor) { //si es mayor que la deuda mayor hasta el momento
					deudaMayor = deudaParcial; // actualizo la mayor deuda.
					deudor = deudorParcial; //actualizo al mayor deudor
				}
			}
		}
		return deudor;
	}
//-------------------------------------------------------
	@Override
	public ElementoEgreso copia() {
		//RETORNA UNA COPIA DEL COMPUESTO NO DE UN ARRAY.
		Contingencia copia = new Contingencia(this.getNombre(), 
				this.getDestino(), this.getFechaPartida(), 
				this.getFechaRegreso(), this.deuda);//HAGO UNA COPIA DE MI MISMO
		
		for(ElementoEgreso c:pasajeros) {//RECORRO MIS HIJOS
			ElementoEgreso copiaHija = c.copia(); //PIDO QUE MIS HIJOS SE COPIEN TAMBIEN
			
			if(copiaHija!=null) { // SI MI HIJO ES != NULL
				copia.setPasajeros(copiaHija); //LO AGREGO A LA NUEVA LISTA
			}
		}
		if(copia.tieneElementos()) // SI SOY !=NULL Y TENGO ELEMENTOS
			return copia;//RETORNO COPIA
		else
			return null; // SINO RETORNO NULL
	}
//------------------------------------------------------
	@Override
	public ArrayList<ElementoEgreso> losQueCumplen(Filtro f1){
		ArrayList<ElementoEgreso> pasajerosQueCumplen = new ArrayList<>();
		
		if(f1.cumple(this)) {	//si yo cumplo
			pasajerosQueCumplen.add(this);	//me agrego a la lista
		}
		
		for(ElementoEgreso e:pasajeros) {	//recorro mis hijos
			pasajerosQueCumplen.addAll(e.losQueCumplen(f1)); //agrego todos mis hijos que cumplan
			}
		
			return pasajerosQueCumplen;	
		}
//-------------------------------------------------------
	
}
