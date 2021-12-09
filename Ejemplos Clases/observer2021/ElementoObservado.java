package observer2021;

import java.util.ArrayList;

public class ElementoObservado {
	
	ArrayList<Interesado> interesadas;
	
	

	public ElementoObservado() {
		this.interesadas = new ArrayList<Interesado>();
	}
	
	public void addInteresada(Interesado ss) {
		interesadas.add(ss);
		
	}
	public void removeInteresada(Interesado ss) {
		interesadas.remove(ss);
		
	}
	public void avisarTodos(double valorViejo) {
    for(int i =0; i<interesadas.size();i++) {
    	interesadas.get(i).avisarCambio(valorViejo, this);
    }
	}
}
