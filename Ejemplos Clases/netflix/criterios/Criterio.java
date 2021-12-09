package netflix.criterios;

import netflix.Pelicula;

public interface Criterio {
    boolean cumple(Pelicula peli);
}
