package sis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Establecimiento {

	public abstract int totalCamas();
	public abstract ArrayList<Cama> getCamas(Paciente p);
	public abstract Establecimiento copia(CriterioSIS c);
	public abstract ArrayList<Paciente> buscar(CriterioSIS c);
	
	public ArrayList<Paciente> buscar(CriterioSIS c, Comparator<Paciente> p) {
		ArrayList<Paciente> temp = this.buscar(c);
		Collections.sort(temp, p);
		return temp;
	}
	
}
