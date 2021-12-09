package sistemaArchivo.filtros;

import sistemaArchivo.ElementoSA;

public class FiltroNombre implements Filtro{
    String nombre;

    public FiltroNombre(String nombre){
        this.nombre = nombre;
    }
    @Override
    public boolean cumple(ElementoSA elem) {
        return elem.getNombre().equals(nombre);
    }
}
