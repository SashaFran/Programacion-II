package sistemaArchivo;

import sistemaArchivo.filtros.Filtro;

import java.util.ArrayList;

public class Link extends ElementoSA{

    ElementoSA loQueApunta;

    public Link(String nombre, ElementoSA loQueApunta){
        super(nombre);
        this.loQueApunta = loQueApunta;
    }

    @Override
    public double getTamanio() {
        return loQueApunta.getTamanio();
    }

    @Override
    public int cantidadArchivos() {
        return 1;
    }

    @Override
    public int cantidadElementos() {
        return 1;
    }

    @Override
    public int cantidadCarpetas() {
        return 0;
    }

    @Override
    public boolean contieneElemento(ElementoSA elquebusco) {
        return loQueApunta.contieneElemento(elquebusco);
    }

    /**
     * Un Link se retorna como resultado de la búsqueda si
     * lo que apunta cumple con el criterio
     * @param f
     * @return
     */
    @Override
    public ArrayList<ElementoSA> buscar(Filtro f) {
        ArrayList<ElementoSA> retorno = new ArrayList<ElementoSA>();
        if (f.cumple(loQueApunta))
            retorno.add(this);
        return retorno;
    }

    public ElementoSA getDestino(){
        return loQueApunta;
    }
}
