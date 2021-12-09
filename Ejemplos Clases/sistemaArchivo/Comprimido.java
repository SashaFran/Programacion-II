package sistemaArchivo;

import sistemaArchivo.filtros.Filtro;

import java.util.ArrayList;

public class Comprimido extends Carpeta{
    private static final String extension = "zip";
    private double tasaCompresion;

    public Comprimido(String nombre, double tasa) {
        super(nombre);
        this.tasaCompresion = tasa;
    }

    @Override
    public String toString() {
        return this.getNombre()+Comprimido.extension;
    }

    @Override
    public double getTamanio(){
        return super.getTamanio() * tasaCompresion;
    }

    @Override
    public int cantidadCarpetas() {
        return 0;
    }

    @Override
    public int cantidadElementos() {
        return 1;
    }

    @Override
    public int cantidadArchivos(){
        return 1;
    }

    /**
     * Un comprimido se retorna como resultado de una búsqueda
     * si alguno de sus elementos cumple con el filtro
     * @param f
     * @return
     */
    public ArrayList<ElementoSA> buscar(Filtro f){
        ArrayList<ElementoSA> encontrados = new ArrayList<>();

        if (super.buscar(f).size()>0)
            encontrados.add(this);

        return encontrados;
    }
}
