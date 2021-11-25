package Empresa;

import Calculadores.CalculadorSueldo;

import java.util.ArrayList;

public class EmpleadoHumilde extends EmpleadoCargo{
    private int cantConocimientos;

    public EmpleadoHumilde(String nombre, String apellido, int edad, CalculadorSueldo calculadorSueldo, int aniosAntiguedad, int cantConocimientos) {
        super(nombre, apellido, edad, calculadorSueldo, aniosAntiguedad);
        this.cantConocimientos = cantConocimientos;
    }

    public int getCantConocimientos() {
        return cantConocimientos;
    }

    public void setCantConocimientos(int cantConocimientos) {
        this.cantConocimientos = cantConocimientos;
    }

    @Override
    public ArrayList<String> getConocimientos() {
        ArrayList<String> conocimientos = this.getConocimientos();
        ArrayList<String> aux = new ArrayList<>();
        for (int i = 0; i < this.cantConocimientos; i++) {
            aux.add(conocimientos.get(i));
        }
        return aux;
    }
}
