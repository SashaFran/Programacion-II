package Empresa;

import Calculadores.CalculadorSueldo;

import java.util.ArrayList;
import java.util.Comparator;

public class Programador extends ElementoEmpresa{

    private ArrayList<String> conocimientos;

    public Programador(String nombre, String apellido, int edad, CalculadorSueldo calculadorSueldo) {
        super(nombre, apellido, edad, calculadorSueldo);
        this.conocimientos = new ArrayList<>();
    }

    @Override
    public double getSueldo() {
        return this.getCalculadorSueldo().sueldo(this);
    }

    @Override
    public ArrayList<String> getConocimientos() {
        ArrayList<String> aux = new ArrayList<>();
        aux.addAll(this.conocimientos);
        return aux;
    }

    @Override
    public ArrayList<ElementoEmpresa> empleadosOrdenados(Comparator<ElementoEmpresa> comp) {
        ArrayList<ElementoEmpresa> aux = new ArrayList<>();
        aux.add(this);
        return aux;
    }

    @Override
    public int cantidadEmpleados() {
        return 1;
    }

    public void addConocimiento(String conocimiento){
        this.conocimientos.add(conocimiento);
    }

    public boolean tengoConocimiento(String conocimiento){
        return this.conocimientos.contains(conocimiento);
    }



}
