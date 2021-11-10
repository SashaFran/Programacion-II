package sistemaCochera;

import java.util.ArrayList;

import sistemaCochera.Filtro.Filtro;

public class Pabellon extends ElementoSistema {
	
	private ArrayList<ElementoSistema> elementos;
	
	public Pabellon() {
		this.elementos = new ArrayList<>();
	}

	
	public void addElemento(ElementoSistema e) {
		this.elementos.add(e);
	}
	
	public ArrayList<Cochera> getCocheras(Filtro f, Auto a) {
		ArrayList<Cochera> res = new ArrayList<>();
		for(ElementoSistema e:elementos) {
			res.addAll(e.getCocheras(f, a));
		}
		return res;
	}

	public int cantCocheras() {
		int total=0;
		for(ElementoSistema e:elementos) {
			total+=e.cantCocheras();
		}
		
		return total;
	}

	public boolean estaVacio() {
		return !elementos.isEmpty();
	}
	
	public ElementoSistema copia(Filtro f) {
		Pabellon copia = new Pabellon();
		for(ElementoSistema e:elementos) {
			ElementoSistema hijoCopia = e.copia(f);
			if(hijoCopia!=null) {
				copia.addElemento(e.copia(f));
			}
		}
		if(copia.estaVacio()) {
			return copia;
		}else {
			return null;
		}
		
	}
	
	

}
