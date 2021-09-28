package gastosPublicos;

public abstract class Contribuyente extends Ciudad{

	private String nombre;
	private int id;
	protected int montoFijo;
	
	public Contribuyente (String nombre, int id, String nombrePais, String nombreProv, String nombreCiudad){
		super(nombrePais, nombreProv, nombreCiudad);
		this.nombre = nombre;
		this.id = id;
		montoFijo = 14000;
	}

	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}
	
	public abstract double totalImpuesto();
	public abstract String mostrar();
	
	public String toString(){
		return "El contribuyente: "+getNombre()+"\nDNI: "+getId()+"\nPaga un total de: "+this.totalImpuesto();
	}

	public int getMontoFijo() {
		return montoFijo;
	}

	public void setMontoFijo(int montoFijo) {
		this.montoFijo = montoFijo;
	}
	
	
	
	
}
