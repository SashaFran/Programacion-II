package strategyv2;

import strategyv2.Ejemplar;

import java.util.Comparator;

public class ComparadorEdicion implements Comparator<Ejemplar> {
    @Override
    public int compare(Ejemplar o1, Ejemplar o2) {
        return o1.getEdicion() - o2.getEdicion();
    }
}
