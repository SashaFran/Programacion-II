package parcialito.Comparadores;


import java.time.LocalDate;

import parcialito.Vendedor;

public class ComparadorVentaTotal extends ComparadorVendedor {

    public ComparadorVentaTotal(LocalDate inicio, LocalDate fin) {
        super(inicio, fin);
    }

    @Override
    public int compare(Vendedor v1, Vendedor v2) {
        double ventas1 = v1.ventasTotales(getInicio(), getFin());
        double ventas2 = v2.ventasTotales(getInicio(), getFin());
        if (ventas1 < ventas2)
            return -1;
        else if (ventas1 > ventas2)
            return 1;  // es exactamente lo mismo poner return 54789 (cualquier numero positivo)
        return 0;
        //return (int) (v1.ventasTotales() - v2.ventasTotales());
    }
}

