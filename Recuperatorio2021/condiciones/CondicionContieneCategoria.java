package condiciones;

import recuperatorio2021.*;

public class CondicionContieneCategoria extends Condicion{
    private String catQueBusco;

    public CondicionContieneCategoria(String catQueBusco) {
        this.catQueBusco = catQueBusco;
    }

    @Override
    public boolean cumple(ProdAbstracto elemento) {
        return elemento.tieneCategoria(catQueBusco);
    }


}
