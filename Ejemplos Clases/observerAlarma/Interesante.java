package observerAlarma;


import java.util.ArrayList;

public class Interesante {

	ArrayList<Interesado> interesados;

	public Interesante() {
		interesados = new ArrayList<Interesado>();
	}
	
	public void addInteresado(Interesado ii) {
		interesados.add(ii);
	}
	
	public void avisarlesAlosInteresados(double viejo, double nuevo) {
		
		for (int i = 0; i < interesados.size(); i++) {
			Interesado oaux = interesados.get(i);
			oaux.avisarCambio(viejo, nuevo);
		
		}
		
	}
}
