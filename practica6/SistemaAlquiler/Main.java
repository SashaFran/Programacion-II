package SistemaAlquiler;

public class Main {

	public static void main(String[] args) {
		Empresa ee = new Empresa("Tandil videos");
		
		Cliente cc= new Cliente("Juan", "Uno", 11111);
		Cliente c1 = new Cliente("Juan", "Dos", 111112);
		
		ElementoAlquilado pp = new Pelicula("Crepusculo", "Catherine Hardwicke", 2008, 20);
		ElementoAlquilado p1 = new Pelicula("Luna Nueva", "Chris Weitz", 2009, 18);
		ElementoAlquilado p2 = new Pelicula("Eclipse", "David Slade", 2010, 16);
		ElementoAlquilado vv = new Vehiculo("Fiat", "AA990XA", 150000,'D', false);
		ElementoAlquilado v1 = new Vehiculo("Ford", "AB970XA", 160000,'D', true);
		
		
		ee.addCliente(cc);
		ee.addCliente(c1);
		ee.addElemento(pp);
		ee.addElemento(p1);
		ee.addElemento(p2);
		ee.addElemento(vv);
		ee.addElemento(v1);
		
		ee.alquilarElemento(pp,cc);
		ee.alquilarElemento(p1,c1);
		ee.alquilarElemento(p2,cc);
		ee.alquilarElemento(vv, c1);
		ee.alquilarElemento(v1, c1);

		System.out.println(cc.getAlquileres());
		System.out.println(c1.getAlquileres());
		
	}

}
