
public class Archivo extends ElementoFS{
    private double tamanio;
    private String extension;

    public Archivo(String nombre, String extension, double tamanio) {
        super(nombre);
        this.tamanio = tamanio;
        this.extension = extension;
    }

    public double getTamanio() {
        return tamanio;
    }

    @Override
    public int cantArchivos() {
        return 1;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }



    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
