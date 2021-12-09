package navidad;

import java.util.ArrayList;

public class Carta {

    private Niño remitente;
    private ArrayList<String> regalos;

    public Carta (Niño remitente, ArrayList<String> regalos) {
        this.remitente = remitente;
        this.regalos = regalos;
    }

    public Niño getPersona () {
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

	public Niño getRemitente() {
		return remitente;
	}
}
