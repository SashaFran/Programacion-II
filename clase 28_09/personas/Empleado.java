package personas;

import java.time.LocalDate;


public class Empleado extends Persona{
    private double sueldoBasico;

    public Empleado(String nombre, LocalDate nacimiento, double sueldoBasico, int cantHijos) {
        super(nombre, nacimiento, cantHijos);
        this.sueldoBasico = sueldoBasico;
    }

    private double calcularBonificaciones(){
        return 0.0; //todo
    }

    private double calcularRetenciones(){
        return 0.0; //todo
    }

    public double getSueldoBasico(){
        return sueldoBasico + calcularBonificaciones() + calcularRetenciones();
    }
}
