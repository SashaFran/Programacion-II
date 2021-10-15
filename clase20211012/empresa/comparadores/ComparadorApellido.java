package empresa.comparadores;

import java.util.Comparator;

import empresa.Empleado;

public class ComparadorApellido implements Comparator<Empleado> {
    @Override
    public int compare(Empleado o1, Empleado o2) {
        return o1.getApellido().compareTo(o2.getApellido());
    }
}
