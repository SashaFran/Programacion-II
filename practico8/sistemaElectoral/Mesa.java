package sistemaElectoral;

import java.util.ArrayList;


public class Mesa extends ElementoVotante {

	private int nroMesa;
	private ArrayList<String> padron;
	private ArrayList<Voto> votos;
	
	public Mesa(int nroMesa) {
		this.nroMesa = nroMesa;
		this.padron = new ArrayList<String>();
		this.votos = new ArrayList<Voto>();
	}

	public boolean existeEnElPadron(String dni) {
		//Una vez que vota se tacha del padron
		return padron.remove(dni);
	}
	
	public void addVoto(String dni, Voto v) {
		if (existeEnElPadron(dni)) {
			this.votos.add(v);
		}
		
	}
	
	public int getNroMesa() {
		return nroMesa;
	}

	@Override
	public ArrayList<Voto> getListaVotosPorCriterio(Criterio c) {
		ArrayList<Voto> resultado = new ArrayList<Voto>();
		for (Voto voto : votos) {
			if (c.cumple(voto)) {
				resultado.add(voto);
			}
		}
		return resultado;
	}

	@Override
	public int getCantidadTotalVotosEmitidos() {
		return votos.size();
	}
}
