package parcialito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import parcialito.Filtros.*;

public class Empresa {
    private ArrayList<Vendedor> vendedores;
    private Comparator<Vendedor> criterioRanking;

    public Empresa(Comparator<Vendedor> criterioRanking) {
        this.vendedores = new ArrayList<>();
        this.criterioRanking = criterioRanking;
    }

    public void setCriterioRanking(Comparator<Vendedor> criterioRanking) {
        this.criterioRanking = criterioRanking;
    }

    public void addVendedor(Vendedor v){
        vendedores.add(v);
    }

    public ArrayList<Vendedor> generarRanking(){
        ArrayList<Vendedor> ranking = new ArrayList<>();
        ranking.addAll(vendedores);
        Collections.sort(ranking, criterioRanking);
        return ranking;
    }
    public ArrayList<Vendedor> buscar(Filtro f){
        ArrayList<Vendedor> resultado = new ArrayList<>();
        for(Vendedor v:vendedores)
            if (f.cumple(v))
                resultado.add(v);
        Collections.sort(resultado);
        return resultado;
    }

}
