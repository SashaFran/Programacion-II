package aseguradora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import aseguradora.Filtro.Filtro;


public class Compuesto extends ElementoAseguradora {

	private ArrayList<ElementoAseguradora> elementos; 
	
	public Compuesto(int dni, String nombreSeguro) {
		super(dni, nombreSeguro);
		this.elementos = new ArrayList<>();
	}

	public void addSeguro(Simple e){
		elementos.add(e);
	}
	@Override
	public double getMontoAsegurado() {
		double total = 0;
		for(ElementoAseguradora e: elementos)
			total += e.getMontoAsegurado();
		return total;
	}

	@Override
	public int getNumeroPoliza() {
        int max = -1;
        for (ElementoAseguradora s:elementos)
            if (s.getNumeroPoliza() > max)
                max = s.getNumeroPoliza();
        return max;
		
	}

	@Override
	public ArrayList<Simple> cumple(Filtro f, Comparator<Simple> orden) {
        ArrayList<Simple> aux = new ArrayList<>();
        for (ElementoAseguradora s:elementos){
            aux.addAll(s.cumple(f, orden));
        }
        Collections.sort(aux, orden);
        return aux;
	}

}
