package navidad;

import java.util.ArrayList;

public class Carta {

    private Ni�o remitente;
    private ArrayList<String> regalos;

    public Carta (Ni�o remitente, ArrayList<String> regalos) {
        this.remitente = remitente;
        this.regalos = regalos;
    }

    public Ni�o getPersona () {
        return this.getPersona();
    }

    public ArrayList<String> getRegalos () {
        return new ArrayList<String>(regalos);
    }

    public void eliminarRegalos () {
        this.regalos.clear();
    }
    public void addRegalo (String regalo) {
        this.regalos.add(regalo);
    }

	public Ni�o getRemitente() {
		return remitente;
	}
}
