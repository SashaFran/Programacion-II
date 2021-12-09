package sistemaPaquetes;

import java.util.ArrayList;

public class Combo extends ElementoPaquete{

	private ArrayList<ElementoPaquete> envios;
	private Criterio criterio;
	
	
	public Combo(int idTraking, Criterio criterio) {
		super(idTraking);
		this.envios = new ArrayList<>();
		this.criterio = criterio;
	}

	public Criterio getCriterio() {
		return criterio;
	}

	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}


	@Override
	public double getPeso() {
		double peso = 0;
		for (ElementoPaquete c: envios){
			peso += c.getPeso();
		}
		return peso;
	}

	@Override
	public ArrayList<Correspondencia> agrupar(Criterio c) {
		ArrayList<Correspondencia> aux = new ArrayList<>();
		for (ElementoPaquete a: envios)
			if(c.cumple(a))
				aux.addAll(a.agrupar(c));
		return aux;
	}

	@Override
	public Persona getDestinatario() {
		Persona destinatario = null;
		for(ElementoPaquete c: envios){
			destinatario = c.getDestinatario();
		}
		return destinatario;
	}
	
	@Override
	public Persona getRemitente() {
		Persona remitente = null;
		for(ElementoPaquete c: envios){
			remitente = c.getDestinatario();
		}
		return remitente;
	}

	//CHEQUEAR
	@Override
	public String getDireccionDestino() {
		String direccion = null;
		for(ElementoPaquete c: envios)
			direccion = c.getDireccionDestino();
		return direccion;
	}



	@Override
	public ElementoPaquete copia(Criterio c) {
		Combo copiaCombo = new Combo(this.getIdTraking(), this.criterio);
		for (ElementoPaquete a: envios){
			ElementoPaquete correspondencia = a.copia(c);
			if (correspondencia!=null)
                copiaCombo.addElemento(a.copia(c));
		}
        if (copiaCombo.tieneElementos())
            return copiaCombo;
        else
            return null;
	}
	
	
	private boolean tieneElementos() {
		return !envios.isEmpty();
		
	}

	public void addElemento(ElementoPaquete e){
		if (criterio.cumple(e)){
			envios.add(e);
		}
			
	}


	

}
