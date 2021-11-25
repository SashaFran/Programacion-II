package Empresa;

import Calculadores.CalculadorSueldo;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoEmpresa {

    private String nombre;
    private String apellido;
    private int edad;
    private CalculadorSueldo calculadorSueldo;

    public ElementoEmpresa(String nombre, String apellido, int edad, CalculadorSueldo calculadorSueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.calculadorSueldo = calculadorSueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public CalculadorSueldo getCalculadorSueldo() {
        return calculadorSueldo;
    }

    public void setCalculadorSueldo(CalculadorSueldo calculadorSueldo) {
        this.calculadorSueldo = calculadorSueldo;
    }

    //-----------------------Metodos--------------------------//

    public abstract double getSueldo();

    public abstract ArrayList<String> getConocimientos();

    public abstract ArrayList<ElementoEmpresa> empleadosOrdenados(Comparator<ElementoEmpresa> comp);

    public abstract int cantidadEmpleados();
}
