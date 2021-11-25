package bazar.Criterio;
import bazar.ElementoAbstracto;

public class CriterioPrecio extends Criterio {

    private double precioMaximo;

    public CriterioPrecio(double precioMaximo) {
        this.precioMaximo = precioMaximo;
    }

    @Override
    public boolean cumple(ElementoAbstracto elemento) {
        return elemento.getPrecio() < precioMaximo;
    }

}
