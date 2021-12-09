package sistemaArchivo;

import sistemaArchivo.filtros.Filtro;
import java.util.ArrayList;

public class Archivo extends ElementoSA {
    private String extension;
    private double tamanio;

    //private String ubicacion; LO VAMOS A RESOLVER DESPUES
    //NOTA: NO MODELAMOS EL CONTENIDO DEL ARCHIVO

    public Archivo(String nombre, String extension, double tamanio){
        super(nombre);
        this.extension = extension;
        this.tamanio = tamanio;
    }

    public void setExtension(String extension) {
        this.extension = extension;
        this.setfModificacion();
    }

    @Override
    public String toString() {
        return this.getNombre()+"."+this.getExtension();
    }

    public boolean contieneElemento(ElementoSA elquebusco){
        return (elquebusco.equals(this));  //Si el que busco soy yo
    }

    @Override
    public ArrayList<ElementoSA> buscar(Filtro f) {
        ArrayList<ElementoSA> aux = new ArrayList<>();
        if (f.cumple(this))
            aux.add(this);
        //return null;   --->  NUNCA
        return aux;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
        this.setfModificacion();
    }

    public String getExtension() {
        return extension;
    }

    public double getTamanio() {
        return tamanio;
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
    public boolean equals(Object obj) {
        try {
            Archivo otro = (Archivo) obj;

            return super.equals(otro) &&
                    this.getExtension().equals(otro.getExtension()) ;

        } catch (Exception e){
            return false;
        }
    }
}
