package Comparadores;

import Empresa.ElementoEmpresa;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<ElementoEmpresa> {
    @Override
    public int compare(ElementoEmpresa o1, ElementoEmpresa o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
