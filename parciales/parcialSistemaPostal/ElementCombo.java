package parcialSistemaPostal;
import java.util.ArrayList;

import parcialSistemaPostal.criterio.Criterio;

public abstract class ElementCombo {

	public ElementCombo(int tra) {
		this.nroTracking=tra;
	}
	
	public int getNroTracking() {
		return nroTracking;
	}

	public void setNroTracking(int nroTracking) {
		this.nroTracking = nroTracking;
	}

	protected int nroTracking;
	public abstract boolean contieneDireccion(String ciudad);
	public abstract boolean contieneRemitente(String remitente);
	public abstract boolean contieneDestinatario(String nombre);
	public abstract int cantidadEnvios();	
	public abstract Persona getDestinatario();
	public abstract Persona getRemitente();
	public abstract double getPeso();	
	public abstract ArrayList<Envio>listarEnvios(Criterio c);
	
	
}
