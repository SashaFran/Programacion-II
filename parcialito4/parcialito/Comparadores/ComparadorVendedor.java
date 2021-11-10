package parcialito.Comparadores;

import parcialito.Vendedor;

import java.time.LocalDate;
import java.util.Comparator;

public abstract class ComparadorVendedor implements Comparator<Vendedor> {
    private LocalDate inicio, fin;

    public ComparadorVendedor(LocalDate inicio, LocalDate fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getFin() {
        return fin;
    }
}
