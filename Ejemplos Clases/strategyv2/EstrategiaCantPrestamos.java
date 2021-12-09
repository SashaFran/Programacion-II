package strategyv2;

import java.util.ArrayList;

public class EstrategiaCantPrestamos implements EstrategiaPrestamo{
    @Override
    public Ejemplar elegiLibro(ArrayList<Ejemplar> posibles) {
        int menor = 10000;
        Ejemplar aRetornar = null;
        for(Ejemplar e:posibles){
            if (e.getCatPrestamos()<menor){
                menor = e.getCatPrestamos();
                aRetornar = e;
            }
        }
        return aRetornar;
    }
}
