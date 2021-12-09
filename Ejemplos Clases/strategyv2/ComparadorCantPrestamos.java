package strategyv2;

import java.util.Comparator;

public class ComparadorCantPrestamos implements Comparator<Ejemplar> {
    @Override
    public int compare(Ejemplar o1, Ejemplar o2) {
        return o1.getCatPrestamos() - o2.getCatPrestamos();
    }
}
