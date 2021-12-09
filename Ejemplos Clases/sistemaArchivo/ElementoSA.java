package sistemaArchivo;

import sistemaArchivo.filtros.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoSA {
    protected String nombre;
    protected LocalDate fCreacion;
    protected LocalDate fModificacion;
    protected Carpeta padre;

    public ElementoSA(String nombre) {
        this.nombre = nombre;
        this.fCreacion = LocalDate.now();
        this.fModificacion = LocalDate.now();
        padre = null;
    }

    protected void setfModificacion() {
        this.fModificacion = LocalDate.now();
    }

    public boolean tienePadre(){
        return this.padre!= null;
    }

    public Carpeta getPadre(){
        return this.padre;
    }

    /**
     * Este método retorna todo el camino desde la raiz hasta este elemento
     * @return
     */
    public String rutaCompleta(){
        if (this.tienePadre())
            return this.getPadre().rutaCompleta()+this.toString();
        else return this.toString();
    }

    public void setPadre(Carpeta padre) {
        this.padre = padre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.setfModificacion();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getfCreacion() {
        return fCreacion;
    }

    public LocalDate getfModificacion() {
        return fModificacion;
    }

    public abstract double getTamanio();
    public abstract int cantidadArchivos();
    public abstract int cantidadElementos();
    public abstract int cantidadCarpetas();
    public abstract boolean contieneElemento(ElementoSA elquebusco);
    public abstract ArrayList<ElementoSA> buscar(Filtro f);

    @Override
    public boolean equals(Object obj) {
        try {
            ElementoSA otra = (ElementoSA) obj;
            if (tienePadre()){
                return this.getNombre().equals(otra.getNombre()) &&
                        this.getPadre().equals(otra.getPadre());
            }
            else {
                return this.getNombre().equals(otra.getNombre()) &&
                        !otra.tienePadre();
            }

        } catch (Exception e){
            return false;
        }
    }
}
