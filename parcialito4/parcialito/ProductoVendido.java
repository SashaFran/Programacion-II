package parcialito;
import java.time.LocalDate;

public class ProductoVendido {
    private LocalDate fechaVenta;
    private String codigo;
    private double precio;
    private int cant;

    public ProductoVendido(LocalDate fechaVenta, String codigo, double precio, int cant) {
        this.fechaVenta = fechaVenta;
        this.codigo = codigo;
        this.precio = precio;
        this.cant = cant;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCant() {
        return cant;
    }

    public boolean entreFechas(LocalDate inicio, LocalDate fin){
        return this.getFechaVenta().compareTo(inicio) > 0 &&
                this.getFechaVenta().compareTo(fin) < 0;
    }

    public double ganancia(){
        return this.getPrecio() * this.getCant();
    }
}
