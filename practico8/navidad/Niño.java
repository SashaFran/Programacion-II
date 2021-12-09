package navidad;

public class Ni�o {

	private int dni;

	public Ni�o(int dni) {
		super();
		this.dni = dni;
	}

	
	public int getDni() {
		return dni;
	}


	@Override
	public boolean equals(Object obj) {
		try{
			Ni�o e = (Ni�o) obj;
			return this.getDni() == e.getDni();
		}catch(Exception e) {
			return false;
		}
	}
	
	
}
