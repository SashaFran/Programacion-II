package sistemaPaquetes;

import java.util.ArrayList;

public class Correspondencia extends ElementoPaquete{

	private double peso;
	private Persona destinatario;
	private Persona remitente;
	private String destino;
	private boolean retiraSucursal;
	
	public Correspondencia(int idTraking, double peso, Persona destinatario,
			Persona remitente, String destino,boolean retiraSucursal) {
		super(idTraking);
		this.peso = peso;
		this.destinatario = destinatario;
		this.remitente = remitente;
		this.destino = destino;
		this.retiraSucursal = retiraSucursal;
	}

	public double getPeso() {
		return peso;
	}

	public Persona getDestinatario() {
		return destinatario;
	}

	public Persona getRemitente() {
		return remitente;
	}

	public boolean isRetiraSucursal() {
		return retiraSucursal;
	}

	@Override
	public String getDireccionDestino() {
		return destino;
	}

	@Override
	public ElementoPaquete copia(Criterio c) {
		if (c.cumple(this))
			return new Correspondencia (this.getIdTraking(),this.peso,this.destinatario,
			this.remitente, this.destino, this.retiraSucursal);
		else 
			return null;
	}
	
	@Override
	public ArrayList<Correspondencia> agrupar(Criterio c) {
		ArrayList<Correspondencia> aux = new ArrayList<>();
		if(c.cumple(this))
			aux.add(this);
		return aux;
	}

	
	
}
