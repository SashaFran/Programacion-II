package sombreroHogwarts;

public abstract class Familiar extends Alumno{

	//Si pertenece en la misma casa
	//Si es sangrepura
	
	private String casa;
	private boolean sangrePura;
	
	public Familiar(String nombre, String casa, boolean sangrePura) {
		super(nombre);
		this.casa = casa;
		this.sangrePura = sangrePura;
	}
	
	public String getCasa() {
		return casa;
	}

	public void setCasa(String casa) {
		this.casa = casa;
	}

	public boolean isSangrePura() {
		return sangrePura;
	}

	public void setSangrePura(boolean sangrePura) {
		this.sangrePura = sangrePura;
	}
	

}
