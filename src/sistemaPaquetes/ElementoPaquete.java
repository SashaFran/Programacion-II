package sistemaPaquetes;

import java.util.ArrayList;

public abstract class ElementoPaquete {

	private int idTraking;
	
	
	public ElementoPaquete(int idTraking) {
		this.idTraking = idTraking;
	}


	public abstract ArrayList<Correspondencia> agrupar(Criterio c);
	public abstract double getPeso();
	public abstract Persona getDestinatario();
	public abstract Persona getRemitente();
	public abstract String getDireccionDestino();	
	public abstract ElementoPaquete copia(Criterio c);
	
	public void setIdTraking(int idTraking) {
		this.idTraking = idTraking;
	}

	public int getIdTraking() {
		return idTraking;
	}

}
