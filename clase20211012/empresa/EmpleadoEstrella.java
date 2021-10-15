package empresa;

import java.util.ArrayList;

public class EmpleadoEstrella extends Empleado{

    public EmpleadoEstrella(String nombre, String apellido, String especialidad, double sueldo) {
        super(nombre, apellido, especialidad, sueldo);
    }

    @Override
    public ArrayList<Empleado> empleadosCon(String especialidad) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(this);
        return empleados;
    }
}
