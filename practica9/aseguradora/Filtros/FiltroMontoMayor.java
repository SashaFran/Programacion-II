package aseguradora.Filtros;

import aseguradora.SeguroSimple;

public class FiltroMontoMayor extends Filtro{
    private double montoMinimo;

    public FiltroMontoMayor(double montoMinimo) {
        this.montoMinimo = montoMinimo;
    }

    @Override
    public boolean cumple(SeguroSimple seguro) {
        return seguro.getMontoAsegurado()>montoMinimo;
    }
}
