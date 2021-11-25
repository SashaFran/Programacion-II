package Calculadores;

import Empresa.ElementoEmpresa;

public class CalculadorMontoFijo extends CalculadorSueldo{
    private double montoFijo;

    public CalculadorMontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double sueldo(ElementoEmpresa e) {
        return this.montoFijo;
    }
}
