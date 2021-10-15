package empresa;

import java.util.ArrayList;

public abstract class ElementoEmpresa {

    public abstract int cantEmpleados();
    public abstract double gastoSueldos();
    public abstract ArrayList<Empleado> empleadosCon(String especialidad);
}
