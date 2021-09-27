package persona;

import java.time.LocalDate;

public class mainPersona {

	public static void main (String[] args){
		Persona pp = new Persona(42424242,"Pepito","Juan",LocalDate.of(2000, 01, 01));
		pp.setAltura(1.75);
		pp.setPeso(66.0);
		pp.setSexo('F');
		
		//Datos basicos
		System.out.println("Nombre: " + pp.getNombre() + "\nApellido: " + pp.getApellido() + "\nDNI: " + pp.getDNI() + "\nFecha de Nacimiento: " + pp.getFechadNac());
		//Datos secundarios
		System.out.println("Altura: "+pp.getAltura()+"\nPeso: "+pp.getPeso()+"\nSexo: "+pp.getSexo()+"\nEs mayor de edad: "+pp.mayordEdad()+"\nSupera la edad ed voto:  "+pp.edadVoto());
	}
}
