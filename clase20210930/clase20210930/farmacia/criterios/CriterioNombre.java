package clase20210930.farmacia.criterios;

import clase20210930.farmacia.Medicamento;

public class CriterioNombre extends Criterio{
    private String nombre;

    public CriterioNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Medicamento m) {
        return m.getNombre().equals(nombre);
    }
}
