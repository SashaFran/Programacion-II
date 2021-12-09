package strategyv2;

import strategyv2.Ejemplar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Biblioteca {

    HashMap<String, ArrayList<Ejemplar>> libros;
    Comparator<Ejemplar> estrategia;

    public Biblioteca(Comparator<Ejemplar> e) {
        this.libros = new HashMap<>();
        estrategia = e;
    }

    public void setEstrategia(Comparator<Ejemplar> nueva){
        this.estrategia = nueva;
    }

    public void addEjemplar(Ejemplar ejemplar){
        if (!libros.containsKey(ejemplar.getTitulo())){
            libros.put(ejemplar.getTitulo(), new ArrayList<>());
        }
        libros.get(ejemplar.getTitulo()).add(ejemplar);
    }

    public Ejemplar prestar(String titulo){
        ArrayList<Ejemplar> posibles = libros.get(titulo);
        Collections.sort(posibles, estrategia);
        if (posibles.size()>0)
            return posibles.get(0);
        else return null;
    }
}
