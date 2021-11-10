package aseguradora.Comparadores;
import java.util.Comparator;
import aseguradora.SeguroSimple;

public class ComparadorDNI implements Comparator<SeguroSimple> {
    @Override
    public int compare(SeguroSimple o1, SeguroSimple o2) {
        return o1.getDniCliente() - o2.getDniCliente();
    }
}
