package empresa.filtros;

import empresa.Empleado;

public class FiltroEspecialidad extends Filtro{
    private String loquebusco;

    public FiltroEspecialidad(String loquebusco) {
        this.loquebusco = loquebusco;
    }

    @Override
    public boolean cumple(Empleado e) {
        return e.getEspecialidad().equals(loquebusco);
    }
}
