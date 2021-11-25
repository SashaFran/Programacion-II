package condiciones;

import recuperatorio2021.*;

public class CondicionPrecioMenor extends Condicion{
    private double precioMaximo;

    public CondicionPrecioMenor(double precioMaximo) {
        this.precioMaximo = precioMaximo;
    }

    @Override
    public boolean cumple(ProdAbstracto elemento) {
        return elemento.getPrecio() < precioMaximo;
    }
}
