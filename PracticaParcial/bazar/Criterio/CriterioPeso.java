package bazar.Criterio;

import bazar.ElementoAbstracto;

public class CriterioPeso extends Criterio {

    private double pesoMaximo;

    public CriterioPeso(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    @Override
    public boolean cumple(ElementoAbstracto elemento) {
        return elemento.getPeso() < pesoMaximo;
    }
}
