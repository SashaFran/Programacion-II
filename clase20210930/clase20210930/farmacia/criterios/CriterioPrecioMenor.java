package clase20210930.farmacia.criterios;

import clase20210930.farmacia.Medicamento;

public class CriterioPrecioMenor extends Criterio{
    private double precioLimite;

    public CriterioPrecioMenor(double precio) {
        this.precioLimite = precio;
    }

    @Override
    public boolean cumple(Medicamento m) {
        return m.getPrecio() < precioLimite;
    }
}
