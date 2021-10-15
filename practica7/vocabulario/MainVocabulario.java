package vocabulario;

//import vocabulario.criterios.Criterio;
//import vocabulario.criterios.CriterioMasFrecuente;

public class MainVocabulario {

	public static void main(String[] args) {
		Vocabulario v= new Vocabulario();
		//Criterio MasFrecuentes = new CriterioMasFrecuente(2);
		//Comparator Comparador2= new ComparatorFrecuencia();
		Palabra p= new Palabra("todos");
		v.seccionarTexto("j k b r t h i A t p c w w n o p q r e s t  ");
		System.out.println(v);
		//System.out.println(v.Filtro_Repetidos(MasFrecuentes));
		//System.out.println(v.frecuenciadeXPalabra(p));
		System.out.println(v.ordenarListaporFrecuencia());
		System.out.println(v.ordenarAlfabeticamente());
	}
}
