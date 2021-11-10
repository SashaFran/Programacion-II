
package sistemaElectoral;

import java.util.ArrayList;
import java.util.Collections;

import sistemaElectoral.criterios.Criterio;

public class Establecimiento extends ElementoElectoral {
	private String nombre;
	private ArrayList<ElementoElectoral>lugar;
	private ArrayList<Candidato> candidatos;
	
	

	public Establecimiento(String nombre) {
		this.nombre=nombre;
		this.lugar = new ArrayList<>();
		this.candidatos = new ArrayList<>();
	}
	
	
	public void agregarLugar(ElementoElectoral l) {
		lugar.add(l);
	}
	
	public void addCandidato(Candidato c){
		candidatos.add(c);
	}


	public double porcentajeporCriterio(Criterio criterio) {
		double prom=0;
		int votosTotales=0;
			votosTotales+=contarTotalidadVotos();
				prom+= contarVotoxCriterio(criterio);
		//return prom;
		//return votosTotales;
		return (double)((prom/votosTotales)*100);
	}


	@Override
	public int contarVotoxCriterio(Criterio criterio) {
		int contador=0;
		for (ElementoElectoral v: lugar) {
			contador+= v.contarVotoxCriterio(criterio);
		}
		return contador;
	}


	 public int contarTotalidadVotos() {
		 int cant=0;
		 for(ElementoElectoral e: lugar) {
		 cant+=e.contarTotalidadVotos();
		 }
		 return cant;
		 }


	@Override
	public String getNombre() {
		return nombre;
	}


	@Override
	public ArrayList<Candidato> listaCandidatos() {
		ArrayList<Candidato>listaCandidatos=new ArrayList<>();
		ArrayList<Candidato>listaC= null;
		for (ElementoElectoral e: lugar) {
			listaC=e.listaCandidatos();
			for (Candidato c: listaC) {
				if (!listaCandidatos.contains(c)){
				listaCandidatos.add(c);
				}
			}
		
		}
		Collections.sort(listaCandidatos);
		return listaCandidatos;
	}
	
}
