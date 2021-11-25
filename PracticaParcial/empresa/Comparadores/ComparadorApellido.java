package Comparadores;

import Empresa.ElementoEmpresa;

import java.util.Comparator;

public class ComparadorApellido implements Comparator<ElementoEmpresa> {
    @Override
    public int compare(ElementoEmpresa o1, ElementoEmpresa o2) {
        return o1.getApellido().compareTo(o2.getApellido());
    }
}
