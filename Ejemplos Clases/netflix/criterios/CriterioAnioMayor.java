package netflix.criterios;

import netflix.Pelicula;

public class CriterioAnioMayor implements Criterio{
    int anioQueBusco;

    public CriterioAnioMayor(int anio){
        anioQueBusco=anio;
    }

    @Override
    public boolean cumple(Pelicula peli) {
        return anioQueBusco > peli.getAnio();
    }
}
