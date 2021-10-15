
import java.time.LocalDate;

public abstract class ElementoFS {
    private String nombre;
    private LocalDate fCreacion;

    public ElementoFS(String nombre) {
        this.nombre = nombre;
        this.fCreacion = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getfCreacion() {
		return fCreacion;
	}

	public abstract double getTamanio();
    public abstract int cantArchivos();
}
