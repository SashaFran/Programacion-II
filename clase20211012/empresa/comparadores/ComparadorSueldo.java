package empresa.comparadores;

import java.util.Comparator;

import empresa.Empleado;

public class ComparadorSueldo implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
        return (int) (o1.gastoSueldos() - o2.gastoSueldos());
    }
}
