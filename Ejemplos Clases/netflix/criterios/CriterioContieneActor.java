package netflix.criterios;

import netflix.Pelicula;


public class CriterioContieneActor implements Criterio{
    String elactor;

    public CriterioContieneActor(String elActorQueBusco){
        elactor = elActorQueBusco;
    }

    @Override
    public boolean cumple(Pelicula peli) {
        return peli.contieneActor(elactor);
    }
}
