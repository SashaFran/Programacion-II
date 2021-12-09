package navidad;

import java.util.ArrayList;

public class Ubicacion extends ElementoNavidad{

    private ArrayList<Buzon> buzones;

    public Ubicacion() {
        this.buzones = new ArrayList<>();
    }

    public void addBuzon (Buzon buzon) {
        this.buzones.add(buzon);
    }

    public int getCantidadDeCartasRegalo (String regalo) {
        int regalos = 0;
        for (Buzon buzon:this.buzones) {
            regalos+=buzon.getCantidadDeCartasRegalo(regalo);
        }
        return regalos;
    }
    
    public double getPorcentajeDeCartasRegalo (String regalo) {
        return (this.getCantidadDeCartasRegalo(regalo) / this.getCantidadCartasRecibidas()) * 100;
    }
    
    public int getNinosMalosEnviaronCarta () {
        int ninosMalos = 0;
        for (Buzon buzon:this.buzones) {
            ninosMalos+=buzon.getNinosMalosEnviaronCarta();
        }
        return ninosMalos;
    }
    public int getCantidadCartasRecibidas () {
        int cant = 0;
        for (Buzon buzon:this.buzones) {
            cant += buzon.getCantidadCartasRecibidas();
        }
        return cant;
    }
}
