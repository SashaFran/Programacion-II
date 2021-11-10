package aseguradora;
import aseguradora.Filtros.Filtro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SeguroIntegrador extends Seguro{

    private ArrayList<Seguro> elementos;

    public SeguroIntegrador(int dniCliente) {
        super(dniCliente);
        elementos = new ArrayList<>();
    }

    @Override
    public int getNroPoliza() {
        int max = -1;
        for (Seguro s:elementos)
            if (s.getNroPoliza() > max)
                max = s.getNroPoliza();
        return max;
    }

    /*public int getNroPolizaVersionAlternativa(){
        ArrayList<Integer> nrosPoliza = new ArrayList<>();
        for(Seguro s:elementos)
            nrosPoliza.add(s.getNroPolizaVersionAlternativa());
        return Collections.max(nrosPoliza);
    }*/

    @Override
    public double getCosto() {
        double suma = 0.0;
        for (Seguro s:elementos)
            suma+= s.getCosto();
        return suma;
    }

    @Override
    public double getMontoAsegurado() {
        double suma = 0.0;
        for (Seguro s:elementos)
            suma+= s.getMontoAsegurado();
        return suma;
    }

    @Override
    public ArrayList<SeguroSimple> segurosQueCumplen(Filtro condicion,
                                                     Comparator<SeguroSimple> orden) {
        ArrayList<SeguroSimple> aux = new ArrayList<>();
        //Lo que NO tienen que hacer
        //for (Seguro s:elementos){
        //    if (condicion.cumple(s))
        //        aux.add(s);
        //}
        for (Seguro s:elementos){
            aux.addAll(s.segurosQueCumplen(condicion, orden));
        }
        Collections.sort(aux, orden);
        return aux;
    }

    public void agregarSeguro(Seguro nuevo){
        this.elementos.add(nuevo);
    }


}
