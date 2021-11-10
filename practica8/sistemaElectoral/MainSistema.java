package sistemaElectoral;

import java.time.LocalTime;
import java.util.Comparator;

import sistemaElectoral.comparadores.*;
//import java.util.Comparator;
//import sistemaElectoral.comparadores.*;
import sistemaElectoral.criterios.*;

public class MainSistema {

	public static void main(String[] args) {
		Establecimiento Escuela1= new Establecimiento("EE N 22");
		
		Candidato c1= new Candidato("pepe", "z", "marylin");
		Candidato c2= new Candidato("jose", "f", "rr");
		Candidato c3= new Candidato("balter", "f", "rr");
		Candidato c4= new Candidato("avi", "f", "rr");
		
		Escuela1.addCandidato(c1);
		Escuela1.addCandidato(c2);
		Escuela1.addCandidato(c3);
		Escuela1.addCandidato(c4);

		
		Comparator<Candidato> compa1= new ComparatorporPartido();
		Comparator<Candidato> compa2= new ComparatorAgrupacion();
		Comparator<Candidato> compa3= new ComparatorNombre();
		Comparator<Candidato> AND1= new ComparatorAnd(compa2,compa3);
		Comparator<Candidato> AND2= new ComparatorAnd(compa1,AND1);
		System.out.println("Escuela 1: " + Escuela1);
		
		
		
		Voto v1= new Voto(1);
		Voto v2= new Voto(2);
		Voto v3= new Voto(3);
		Voto v4= new Voto(4);
		Voto v5= new Voto(5);
		Voto v6= new Voto(6);
		Voto v7= new Voto(7);
		Voto v8= new Voto(8);
		
		v1.votar(c2);
		v2.votar(c4);
		v3.votar(c3);
		v4.votar(c1);
		v5.votar(c1);
		v6.votar(c2);
		v7.votar(c3);
		v8.votar(c2);
		
		
		
		Mesa mesa1= new Mesa("n867");
		Mesa mesa2= new Mesa("n11");
		mesa1.agregardniPadron(1);
		mesa1.agregardniPadron(2);
		mesa1.agregardniPadron(3);
		mesa1.agregarVoto(v1);
		mesa1.agregarVoto(v2);
		mesa1.agregarVoto(v3);
		

		
		
		mesa2.agregardniPadron(4);
		mesa2.agregardniPadron(5);
		mesa2.agregarVoto(v4);
		mesa2.agregarVoto(v5);
		
		Escuela1.agregarLugar(mesa1);
		Escuela1.agregarLugar(mesa2);
		Establecimiento Escuela2= new Establecimiento("Tecnica");
		
		Mesa mesa3= new Mesa("n222");
		mesa3.agregardniPadron(6);
		mesa3.agregardniPadron(7);
		mesa3.agregardniPadron(8);
		mesa3.agregarVoto(v6);
		mesa3.agregarVoto(v7);
		mesa3.agregarVoto(v8);
		
		Escuela2.agregarLugar(mesa3);
		
		Establecimiento gardey= new Establecimiento ("gardey");
		gardey.agregarLugar(Escuela1);
		gardey.agregarLugar(Escuela2);
		
		LocalTime h1= LocalTime.of(00,00);
		LocalTime h2= LocalTime.of(15, 00);
		
		Criterio candidato = new CriterioCandidato(c1);
		int cantCandidatos = Escuela1.contarVotoxCriterio(candidato);
		System.out.println("Cantidatos de votos por candidatos: "+cantCandidatos);
		
		Criterio votosenblanco= new CriterioVotosBlanco();
		int votosEnBlanco = Escuela1.contarVotoxCriterio(votosenblanco);
		System.out.println("Cantidad votos en blanco: "+ votosEnBlanco);
		
		
		Criterio votosenHora= new CriterioHorario(h1,h2);
		int votosxHora = Escuela1.contarVotoxCriterio(votosenHora);
		System.out.println("Cantidad votos en blanco: "+ votosxHora);
		
		System.out.println(gardey.listaCandidatos());
	}
	

}
