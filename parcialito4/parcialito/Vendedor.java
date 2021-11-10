package parcialito;

import java.time.LocalDate;
import java.util.ArrayList;

public class Vendedor implements Comparable<Vendedor>{
    private String nombre, apellido;
    private int edad;
    private ArrayList<ProductoVendido> ventas;

    public Vendedor(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ventas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void addVenta(ProductoVendido v){
        ventas.add(v);
    }

    @Override
    public int compareTo(Vendedor o) {
        int res = this.getApellido().compareTo(o.getApellido());
        if (res == 0)
            return this.getNombre().compareTo(o.getNombre());
        return res;
    }


    public double ventasTotales(LocalDate inicio, LocalDate fin) {
        double total = 0.0;
        for (ProductoVendido p:ventas)
            if (p.entreFechas(inicio, fin))
                total+=p.ganancia();
        return total;
    }

    public int cantidadVentas(LocalDate inicio, LocalDate fin) {
        int total = 0;
        for (ProductoVendido p:ventas)
            if (p.entreFechas(inicio, fin))
                total++;
        return total;
    }

    public boolean vendio(String codigo) {
        for (ProductoVendido p:ventas)
            if (p.getCodigo().equals(codigo))
                return true;
        return false;
    }
}
