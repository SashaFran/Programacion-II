package clase05;

public class AccesoDirecto extends Elemento{
	
	public static final double TAMA�O = 1;
	private static final String PREFIJO = "Acceso directo a ";
	private Elemento loQueApunta;
	
	public AccesoDirecto(Elemento loQueApunta) {
		super("Nombre: "+PREFIJO+loQueApunta.getNombre());
		this.loQueApunta = loQueApunta;
	}

	@Override
	public double getTama�o() {
		return TAMA�O;
	}

	@Override
	public int cantArchivos() {
		return 0; //ausencia de valor
	}

	public Elemento getLoQueApunta() {
		return loQueApunta;
	}

	
	

}
