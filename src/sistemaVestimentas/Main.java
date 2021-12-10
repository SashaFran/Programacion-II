package sistemaVestimentas;

public class Main {

	 /* Color rojo, Estaci�n Verano.
	- Que el color est� dentro de una lista de colores dada, que la estaci�n sea primavera.
	- Que combine el color del pantal�n con el de la camisa (por cuestiones pr�cticas
	denominaremos �combinar� a que el color sea el mismo)
	- Que la Estaci�n del saco sea la misma que la estaci�n del pantal�n.
	- Que la ocasi�n del vestido sea la misma que la ocasi�n de la chaqueta.
	- Que el color del cintur�n no sea el mismo que el de los guantes.
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Usuario a = new Usuario("A", "Rojo", "Verano");
		Usuario b = new Usuario("B", "Azul", "Invierno");
		Usuario c = new Usuario("C", "Verde", "Oto�o");
		
		Prenda pa = new Prenda("pa" , "Pantalon" ,  "negro" , "Verano");
		Prenda pb = new Prenda("pb" , "Pantalon" , "Rojo" , "Verano");
		Prenda pc = new Prenda("pc" , "Remeron" , "Azul" , "Invierno");
		Prenda pd = new Prenda("pd" , "Sweater" , "Verde" , "Oto�o");
		Prenda pe = new Prenda("pe" , "Sweater" , "Verde" , "Verano");
		
		Combo ca = new Combo("Combo1");
		Combo cb = new Combo("Combo2");
		Combo cc = new Combo("Combo3");
		
		ca.addCombo(pa);
		ca.addCombo(pc);
		
		cb.addCombo(pb);
		cb.addCombo(pa);
		
		cc.addCombo(pe);
		
		CriterioCategoria c1 = new CriterioCategoria("Pantalon");
		CriterioCategoria c2 = new CriterioCategoria("Sweater");
		

		CriterioEstacion c3 = new CriterioEstacion("Verano");

		CriterioEstacion c4 = new CriterioEstacion("Invierno");
		
		//No especifica que sea por usuario, si no por criterio que pueda pedir el usuario.
		System.out.println("Listado prendas  " + cb.listado(c1));
		

	}

}
