package futbol;

import java.time.LocalDate;

public class MainFutbol {

	public static void main(String[] args){
		
	Seleccion ss = new Seleccion();
	
	Futbolista ff = new Futbolista("Pedro", "Juanse", 1111111, LocalDate.of(1990,12,01), 'V','z', 5);
	Masajista mm = new Masajista("juancito", "Dos", 1111112, LocalDate.of(1999,9,01), 'C', "Masajista", 15);
	Entrenador ee = new Entrenador("Juancito", "tres", 1111113, LocalDate.of(1988,7,03), 'P', 1);
	
	ss.addFutbolista(ff);
	ss.addMasajista(mm);
	ss.addEntrenador(ee);
	//Se puede hacer abstract con un mostrar(); en vez de toString
	//y llamarlo con Syso(ss);
	
	System.out.println(ff);
	System.out.println("-----------------------------------");
	System.out.println(mm);
	System.out.println("-----------------------------------");
	System.out.println(ee);
	
	}	
	
}
