package sistemaCochera;

import java.util.ArrayList;

import sistemaCochera.Filtro.Filtro;

public class Cochera extends ElementoSistema{
	
	private ArrayList<String> facilidades;
	private Auto auto;
	
	
	public Cochera(Auto auto) {
		this.facilidades = new ArrayList<>();
		this.auto = auto;
	}


	public ArrayList<Cochera> getCocheras(Filtro f, Auto a) {
		ArrayList<Cochera> res = new ArrayList<>();
		if(this.auto == null && f.cumple(a)) {
			res.add(this);
		}
		return res;
	}


	public int cantCocheras() {
		return 1;
	}


	public ElementoSistema copia(Filtro f) {
		if(f.cumple(this.auto)) {
			return new Cochera(this.auto);
		}else {
			return null;
		}	
	
	}


	public ArrayList<String> getFacilidades() {
		return facilidades;
	}


	public Auto getAuto() {
		return auto;
	}
	

	
	
}
