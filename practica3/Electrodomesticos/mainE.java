package Electrodomesticos;

public class mainE {

	public static void main(String[] args){
	
		Electrodomestico ee = new Electrodomestico("Lavarropas");
		Electrodomestico e1 = new Electrodomestico("Pava Electrica", "blanco",50.00,2500,24);
	
		//Lavarropas
		
	System.out.println("Nombre: "+ee.getNombre()+"\nColore: "+ee.getColor()+"\nPeso: "+ee.getPeso()+"\nPrecio: "+ee.getPrecio());
	System.out.println("Balance: "+ee.getBalance()+"\nEs Alta gama?: "+ee.altaGama()+"\nTiene bajo consumo: "+ee.bajoConsumo());
		
	System.out.println("--------------------------------------------------------");
	//Pava electrica
	System.out.println("Nombre: "+e1.getNombre()+"\nColore: "+e1.getColor()+"\nPeso: "+e1.getPeso()+"\nPrecio: "+e1.getPrecio());
	System.out.println("Balance: "+e1.getBalance()+"\nEs Alta gama?: "+e1.altaGama()+"\nTiene bajo consumo: "+e1.bajoConsumo());
	
	}
}
