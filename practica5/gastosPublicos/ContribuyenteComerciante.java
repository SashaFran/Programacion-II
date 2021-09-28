package gastosPublicos;

public class ContribuyenteComerciante extends Contribuyente{

	private int cantVentas;
	private int precioArticulo;
	

	
	public ContribuyenteComerciante(String nombre, int id, String nombreProv, String nombrePais, String nombreCiudad, int cantVentas, int precioArticulo) {
		super(nombre, id, nombreProv, nombrePais, nombreCiudad);
		this.cantVentas = cantVentas;
		this.precioArticulo = precioArticulo;
	}


	@Override
	public double totalImpuesto() {
		int impuesto = (super.getMontoFijo()/2);
		double ventas = ((getCantVentas()*getPrecioArticulo())*0.35); 
		return (impuesto + ventas);
	}

	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public int getPrecioArticulo() {
		return precioArticulo;
	}

	public void setPrecioArticulo(int precioArticulo) {
		this.precioArticulo = precioArticulo;
	}


	@Override
	public String mostrar() {
		return "Nombre: "+super.getNombre()+ "\nID: "+super.getId()+"\nPaga: "+this.totalImpuesto();
	}
	
	public String toString(){
		return "Contribuyente Comerciante"+"\nUbicacion: "+super.getNombrePais()+", "+super.getNombreProv()+", "+super.getNombreCiudad();
		}
	

}
