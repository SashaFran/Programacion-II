package netflix.criterios;

import netflix.Pelicula;

public class CriterioNot implements Criterio{
    Criterio criterio;
    public CriterioNot(Criterio c){
        criterio = c;
    }

    @Override
    public boolean cumple(Pelicula peli) {
        return !criterio.cumple(peli);
    }
}
