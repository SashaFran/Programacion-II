package empresa.filtros;

import empresa.Empleado;

public abstract class Filtro {
    public abstract boolean cumple(Empleado e);
}
