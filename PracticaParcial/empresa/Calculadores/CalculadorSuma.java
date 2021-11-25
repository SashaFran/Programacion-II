package Calculadores;

import Empresa.ElementoEmpresa;

public class CalculadorSuma extends CalculadorSueldo{
    private CalculadorSueldo c1;
    private CalculadorSueldo c2;

    public CalculadorSuma(CalculadorSueldo c1, CalculadorSueldo c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double sueldo(ElementoEmpresa e) {
        return c1.sueldo(e) + c2.sueldo(e);
    }
}
