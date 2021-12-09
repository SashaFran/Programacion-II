package strategyv2;

import java.util.Comparator;

public class ComparadorEstado implements Comparator<Ejemplar> {
    @Override
    public int compare(Ejemplar o1, Ejemplar o2) {
        if (!o1.isBueno())
            return 1;
        else return -1;
    }
}
