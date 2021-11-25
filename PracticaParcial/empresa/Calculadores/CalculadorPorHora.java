package Calculadores;

import Empresa.ElementoEmpresa;

public class CalculadorPorHora extends CalculadorSueldo{
    private double valorXHora;
    private int horaTrabajada;

    public CalculadorPorHora(double valorXHora, int horaTrabajada) {
        this.valorXHora = valorXHora;
        this.horaTrabajada = horaTrabajada;
    }

    @Override
    public double sueldo(ElementoEmpresa e) {
        return this.horaTrabajada * this.valorXHora;
    }
}
