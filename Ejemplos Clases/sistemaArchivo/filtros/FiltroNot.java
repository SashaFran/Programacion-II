package sistemaArchivo.filtros;

import sistemaArchivo.ElementoSA;

public class FiltroNot implements Filtro{
    Filtro f;

    public FiltroNot(Filtro f){
        this.f = f;
    }

    @Override
    public boolean cumple(ElementoSA elem) {
        return !f.cumple(elem);
    }
}
