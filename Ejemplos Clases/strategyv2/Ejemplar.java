package strategyv2;

public class Ejemplar {

    private String titulo;
    private int catPrestamos;
    private boolean bueno;
    private int edicion;

    public Ejemplar(String titulo, int catPrestamos, boolean bueno, int edicion) {
        this.titulo = titulo;
        this.catPrestamos = catPrestamos;
        this.bueno = bueno;
        this.edicion = edicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCatPrestamos() {
        return catPrestamos;
    }

    public void setCatPrestamos(int catPrestamos) {
        this.catPrestamos = catPrestamos;
    }

    public boolean isBueno() {
        return bueno;
    }

    public void setBueno(boolean bueno) {
        this.bueno = bueno;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }
}
