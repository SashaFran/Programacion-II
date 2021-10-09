package SistemaAlquiler;


public class Vehiculo extends ElementoAlquilado{

	private String marca, patente;
	private int kms;
	private char combustible; //'e' = electrico, 'n' = naftero, 'd' = diesel.
	private boolean ocupado;
	
	public Vehiculo(String marca, String patente, int kms, char combustible, boolean ocupado){
		super();
		this.marca = marca;
		this.patente = patente;
		this.kms = kms;
		this.combustible = combustible;
		this.ocupado = ocupado;
		
	}

	public String getMarca() {
		return marca;
	}

	public String getPatente() {
		return patente;
	}

	public int getKms() {
		return kms;
	}
	
	public boolean isOcupado() {
		return ocupado;
	}

	public char getCombustible() {
		return combustible;
	}

	@Override
	public boolean isDisponible() {
		if (!ocupado){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public void devolucion() {
		ocupado = false;
		
	}

	@Override
	public void elementoAlquilado() {
		ocupado = true;
		
	}
	
	public String toString(){
		return "Vehiculo"+"\nMarca: "+this.getMarca()+"\npatente: "+this.getPatente()+"\nKilometraje: "+this.getKms()+"\nDisponible: "+this.isOcupado();
	}

	@Override
	public String getElementoAlquilado() {
		return "Vehiculo";
	}
	
	
	
}
