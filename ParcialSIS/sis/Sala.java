package sis;

import java.util.ArrayList;

public class Sala extends Establecimiento {

private ArrayList<Establecimiento> elementos;
	
	public Sala() {
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(Establecimiento elem) {
		elementos.add(elem);
	}
	
	@Override
	public int totalCamas() {
		int contador = 0;
		for(Establecimiento el:elementos) {
			contador += el.totalCamas();
		}
		return contador;
	}

	@Override
	public ArrayList<Cama> getCamas(Paciente pac) {
		ArrayList<Cama> camasQueCumplen = new ArrayList<>();
		
		for(Establecimiento e:elementos) {
			camasQueCumplen.addAll(e.getCamas(pac));
		}
		
		/* SI ME PIDIERAN SIN ELEMENTOS REPETIDOS
		for(ElementoSIS e:elementos) {
			ArrayList<Cama> aux = e.getCamas(pac);
			for(Cama cumple:aux) {
				if(!camasQueCumplen.contains(cumple)) {
					camasQueCumplen.add(cumple);
				}
			}
		}*/
		return camasQueCumplen;
	}

	@Override
	public Establecimiento copia(CriterioSIS crit) {
		Sala copia = new Sala();
		for(Establecimiento e:elementos) {
			Establecimiento copiaHijo = e.copia(crit);
			if(copiaHijo != null) {
				copia.addElemento(e);
			}
		}
		if(copia.tieneElementos()) {
			return copia;
		}
		return null;
	}

	public boolean tieneElementos() {
		return elementos.size() > 0;
	}

	@Override
	public ArrayList<Paciente> buscar(CriterioSIS c) {
		ArrayList<Paciente> aux = new ArrayList<>();
		for(Establecimiento e: elementos){
			aux.addAll(e.buscar(c));
		}
		return aux;
	}
}
