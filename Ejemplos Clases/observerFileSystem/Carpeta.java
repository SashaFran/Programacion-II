package observerFileSystem;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Carpeta extends ElementoFS implements Observer{

	ArrayList<ElementoFS> elementos;

	public Carpeta() {
	  elementos = new ArrayList<ElementoFS>();	
	  
	  tam =0;
	}
	
	public void addElemento(ElementoFS ele) {
		elementos.add(ele);
		ele.addObserver(this);
		this.recalcularTamaño();
	}
	
	public void removeElemento(ElementoFS ele) {
		elementos.remove(ele);
		ele.deleteObserver(this);
		this.recalcularTamaño();
	}
	

	private void recalcularTamaño() {
		double viejo = tam;
		tam = 0;
		for (int i = 0; i < elementos.size(); i++) {
			tam = tam + elementos.get(i).getTamaño();
		}
		if (viejo!= tam) {
	    	this.setChanged();
		    this.notifyObservers();
		}
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.recalcularTamaño();
		
	}
	

	
}
