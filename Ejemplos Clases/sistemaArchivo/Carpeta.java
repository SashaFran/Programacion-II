package sistemaArchivo;

import sistemaArchivo.filtros.Filtro;
import java.util.ArrayList;

public class Carpeta extends ElementoSA{

    protected ArrayList<ElementoSA> contenido;


    public Carpeta(String nombre){
        super(nombre);
        this.contenido = new ArrayList<>();
    }

    public void addElemento(ElementoSA elem){
        contenido.add(elem);
        elem.setPadre(this);
    }

    public boolean contieneElemento(ElementoSA elquebusco){
        if (elquebusco.equals(this))
            return true;
        else {
            for (ElementoSA elem : contenido) {
                if (elem.contieneElemento(elquebusco))
                    return true;
            }
            return false;
        }
    }

    public boolean vacia(){
        return contenido.size()==0;
    }

    @Override
    public int cantidadArchivos(){
        int cant = 0;
        for (ElementoSA elem:contenido){
            cant += elem.cantidadArchivos();
        }
        return cant;
    }

    @Override
    public int cantidadElementos() {
        int cant = 0;
        for (ElementoSA elem:contenido){
            cant += elem.cantidadElementos();
        }
        return cant + 1; //(+YO);
    }

    @Override
    public int cantidadCarpetas() {
        int cant = 0;
        for (ElementoSA elem:contenido){
            cant += elem.cantidadCarpetas();
        }
        return cant + 1; //(+YO);
    }

    public double getTamanio(){
        double tamanioTotal = 0.0;
        for(ElementoSA elem:contenido){
            tamanioTotal += elem.getTamanio();
        }
        return tamanioTotal;

        //ESTO ESTARIA ****PESIMO****
        //for (ElementoSA elem:contenido){
            //si sos un archivo
            //tamanio total += elem.getTamano
            //si sos una carpeta
       // }
    }

    @Override
    public String toString() {
        return this.getNombre()+"/";
    }

    //ESTE METODO SOLO BUSCA SUPERFICIAL (1 NIVEL)
    // NO ENTRA RECURSIVO HASTA EL FONDO DEL ARBOL
//    public ArrayList<ElementoSA> buscar(Filtro f){
//        ArrayList<ElementoSA> encontrados = new ArrayList<>();
//        for(ElementoSA elem: contenido){
//            if (f.cumple(elem))
//                encontrados.add(elem);
//        }
//        return encontrados;
//    }

    public ArrayList<ElementoSA> buscar(Filtro f){
        ArrayList<ElementoSA> encontrados = new ArrayList<>();

        if (f.cumple(this))
            encontrados.add(this);

        for(ElementoSA elem: contenido){
            //EL addAll agrega todos los elementos que paso por parámetro
            // a la lista
            encontrados.addAll(elem.buscar(f));

            //el addAll seria equivalente a hacer esto
            //ArrayList<ElementoSA> aux = elem.buscar(f);
            //for (ElementoSA temp:aux)
            //    encontrados.add(temp);
        }

        return encontrados;
    }
}
