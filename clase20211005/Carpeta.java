
import java.util.ArrayList;

public class Carpeta extends ElementoFS{

    private ArrayList<ElementoFS> elementos;

    public Carpeta(String nombre){
        super(nombre);
        elementos = new ArrayList<>();
    }

    public int cantArchivos(){
        //return elementos.size(); //Retorna la cantidad de hijos, no de archivos
                                 //Solo mira hijos directos
        int total = 0;
        for (ElementoFS elemento:elementos)
            total += elemento.cantArchivos();
        return total;
    }

    public double getTamanio(){
        double total = 0.0;
        for (ElementoFS elemento: elementos)
            total+=elemento.getTamanio();
        return total;
    }
}
