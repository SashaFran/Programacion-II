package parcialito.Comparadores;

import parcialito.Vendedor;

import java.time.LocalDate;

public class ComparadorCantidadVentas extends ComparadorVendedor {

    public ComparadorCantidadVentas(LocalDate inicio, LocalDate fin) {
        super(inicio, fin);
    }

    @Override
    public int compare(Vendedor v1, Vendedor v2) {
        return v1.cantidadVentas(getInicio(), getInicio()) - v2.cantidadVentas(getInicio(), getFin());
    }
}
