package navidad;

public class Niño {

	private int dni;

	public Niño(int dni) {
		super();
		this.dni = dni;
	}

	
	public int getDni() {
		return dni;
	}


	@Override
	public boolean equals(Object obj) {
		try{
			Niño e = (Niño) obj;
			return this.getDni() == e.getDni();
		}catch(Exception e) {
			return false;
		}
	}
	
	
}
