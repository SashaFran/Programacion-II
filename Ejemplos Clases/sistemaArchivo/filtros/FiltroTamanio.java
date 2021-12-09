package sistemaArchivo.filtros;

import sistemaArchivo.ElementoSA;

public class FiltroTamanio implements Filtro{
    double tamanioQueBusco;

    public FiltroTamanio(double tam){
        tamanioQueBusco = tam;
    }


    @Override
    public boolean cumple(ElementoSA elem) {
        return elem.getTamanio() > tamanioQueBusco;
    }
}
