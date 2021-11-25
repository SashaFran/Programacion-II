package Empresa;

import Calculadores.CalculadorSueldo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpleadoCargo extends ElementoEmpresa{

    private ArrayList<ElementoEmpresa> elementos;
    private int aniosAntiguedad;

    public EmpleadoCargo(String nombre, String apellido, int edad, CalculadorSueldo calculadorSueldo, int aniosAntiguedad) {
        super(nombre, apellido, edad, calculadorSueldo);
        this.elementos = new ArrayList<>();
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public void addElemento(ElementoEmpresa e){
        this.elementos.add(e);
    }

    public boolean tieneElementos(){
        return !this.elementos.isEmpty();
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    @Override
    public double getSueldo() {
        double auxiliar = this.getCalculadorSueldo().sueldo(this);
        for (ElementoEmpresa e: elementos) {
            auxiliar += e.getSueldo();
        }
        return auxiliar;
    }

    @Override
    public ArrayList<String> getConocimientos() {
        ArrayList<String> aux = new ArrayList<>();
        for (ElementoEmpresa e:elementos) {
            ArrayList<String> auxSimple = e.getConocimientos();
            for (String s:auxSimple) {
                if(!aux.contains(s))
                    aux.add(s);
            }
        }
        return aux;
    }

    @Override
    public ArrayList<ElementoEmpresa> empleadosOrdenados(Comparator<ElementoEmpresa> comp) {
        ArrayList<ElementoEmpresa> aux = new ArrayList<>();
        for (ElementoEmpresa e:elementos) {
            aux.addAll(e.empleadosOrdenados(comp));
        }
        Collections.sort(aux, comp);
        return aux;
    }

    @Override
    public int cantidadEmpleados() {
        int aux = 0;
        for (ElementoEmpresa e:elementos) {
            aux += e.cantidadEmpleados();
        }
        return aux;
    }
}
