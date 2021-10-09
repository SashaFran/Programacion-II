package personas;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private LocalDate nacimiento;
    int cantHijos;

    public Persona(String nombre, LocalDate nacimiento, int cantHijos) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.cantHijos = cantHijos;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public int getEdad(){
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(nacimiento, ahora);
        return periodo.getYears();
    }

    public int getCantHijos() {
        return cantHijos;
    }

    /**
     * Retorna un valor positivo si this es mayor que el elemento parámetro
     * un valor negativo si this es menor que el parámetro
     * y 0 si son iguales
     * @param o
     * @return
     */
    @Override
    public int compareTo(Persona otra) {
        /*if (this.cantHijos < otra.getCantHijos())
            return -1;
        else if (this.cantHijos > otra.getCantHijos())
            return 1;
        else return 0;*/

        return this.cantHijos - otra.getCantHijos();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", cantHijos=" + cantHijos +
                '}';
    }
}
