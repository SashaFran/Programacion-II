package zoologico;

import zoologico.Jaula;

public class CriterioOr extends Criterio{
    Criterio c1, c2;

    @Override
    public boolean cumple(Jaula j) {
        return c1.cumple(j) || c2.cumple(j);

    }
}
