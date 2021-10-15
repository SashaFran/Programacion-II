
public class AccesoDirecto extends ElementoFS{
    private static final double TAMANIO = 1;
    private static final String PREFIJO = "Acceso directo a ";
    private ElementoFS loQueApunta;

    public AccesoDirecto(ElementoFS loQueApunta) {
        super(PREFIJO+loQueApunta.getNombre());
        this.loQueApunta = loQueApunta;
    }

    public String getNombre(){
        return PREFIJO+loQueApunta.getNombre();
    }

    @Override
    public double getTamanio() {
        return TAMANIO;
    }

    @Override
    public int cantArchivos() {
        return 0;
    }
}
