package observer2021.FS;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Carpeta extends Elemento implements Observer{
 
	ArrayList<Elemento> elementos;
	
	
	
	public void addElemento(Elemento e1) {
		elementos.add(e1);
		e1.addObserver(this);
		double valorViejo = tam;
		tam = tam + e1.getTamanio();
		if (valorViejo!= tam) {
			this.setChanged();
			this.notifyObservers();
		}	
	}

	
	public void removeElemento(Elemento e1) {
	  if (elementos.contains(e1)) {
		elementos.remove(e1);
		e1.deleteObserver(this);
		double valorViejo = tam;
		tam = tam - e1.getTamanio();
		if (valorViejo!= tam) {
			this.setChanged();
			this.notifyObservers();
		}	
	  }	
	}
	
	
	
	@Override
	public void update(Observable o, Object arg) {
		double valorviejo = tam; 
		tam = 0;
		for(int i =0; i<elementos.size();i++) {
			tam = tam + elementos.get(i).getTamanio();
		}
		if(tam != valorviejo) {
			this.setChanged();
			this.notifyObservers();
		}
		
	}
	
	
}
