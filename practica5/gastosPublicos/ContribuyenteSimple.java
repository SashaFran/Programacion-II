package gastosPublicos;

/*
 * abona un monto fijo en concepto de impuesto. 
 */
public class ContribuyenteSimple extends Contribuyente{

	public ContribuyenteSimple(String nombre, int id, String nombrePais, String nombreProv, String nombreCiudad) {
		super(nombre, id, nombrePais, nombreProv, nombreCiudad);
		
	}

	@Override
	public double totalImpuesto() {
		return super.getMontoFijo();
	}

	public String mostrar() {
		return "Nombre: "+super.getNombre()+ "\nID: "+super.getId()+"\nPaga: "+this.totalImpuesto();
	}
	
	public String toString(){
		return "Contribuyente Simple"+"\nUbicacion: "+super.getNombrePais()+", "+super.getNombreProv()+", "+super.getNombreCiudad();
	}
}
