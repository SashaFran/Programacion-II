package sis;

import java.util.ArrayList;

public class Cama extends Establecimiento {

	private ArrayList<String> equipamiento;
	private Paciente paciente;
	private CriterioSIS criterioAceptacion;
	
	
	public Cama(CriterioSIS criterioAceptacion) {
		this.equipamiento = new ArrayList<>();
		this.paciente = null;
		this.criterioAceptacion = criterioAceptacion;
	}

	@Override
	public int totalCamas() {
		return 1;
	}

	@Override
	public ArrayList<Cama> getCamas(Paciente p) {
		ArrayList<Cama> camaLibre = new ArrayList<>();
		if(this.estaLibre() && this.criterioAceptacion.cumple(p)){
			camaLibre.add(this);
		}
		return camaLibre;
	}

	private boolean estaLibre() {
		if(paciente == null){
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Establecimiento copia(CriterioSIS c) {
		if(!this.estaLibre()) {
			if(c.cumple(this.paciente)) {
				Cama copia = new Cama(this.criterioAceptacion);
				copia.setPaciente(this.paciente.copia());
				for(String eq:this.equipamiento) {
					copia.addEquipamiento(eq);
				}
				return copia;
			}
		}
		return null;
	}
	
	public void setPaciente(Paciente p) {
		if(this.estaLibre() && this.criterioAceptacion.cumple(p)) {
			this.paciente = p;
		}
	}

	private void addEquipamiento(String e) {
		if(!equipamiento.contains(e))
			equipamiento.add(e);
	}

	@Override
	public ArrayList<Paciente> buscar(CriterioSIS c) {
		ArrayList<Paciente> temp = new ArrayList<>();
		if(c.cumple(this.paciente)){
			temp.add(this.paciente);
			
		}
		return temp;
	}


}
