package gastosPublicos;

/*
 * - Contribuyente programador: abona el 20% del monto fijo 
 * y el 2% sobre el valor facturado por desarrollo de software. 
 */
public class ContribuyenteProgramador extends Contribuyente{

	private int sueldo;
	
	public ContribuyenteProgramador(String nombre, int id, String nombreProv, String nombrePais, String nombreCiudad) {
		super(nombre, id, nombreProv, nombrePais, nombreCiudad);
		sueldo = 70000;

	}
	public String mostrar() {
		return "Nombre: "+super.getNombre()+ "\nID: "+super.getId()+"\nPaga: "+this.totalImpuesto();
	}
	
	public String toString(){
		return "Contribuyente Programador"+"\nUbicacion: "+super.getNombrePais()+", "+super.getNombreProv()+", "+super.getNombreCiudad();
	}

	@Override
	public double totalImpuesto() {
		Double impuesto = (super.getMontoFijo()*0.20);
		Double sueldoImpuesto = (getSueldo()*0.2);
		return (impuesto + sueldoImpuesto);
	}

	public int getSueldo() {
		return sueldo;
	}

	

}
