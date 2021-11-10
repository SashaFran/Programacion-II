package aseguradora.Filtros;

import aseguradora.SeguroSimple;


public abstract class Filtro {
    public abstract boolean cumple(SeguroSimple seguro);
}
