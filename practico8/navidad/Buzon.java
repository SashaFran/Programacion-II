package navidad;

import java.util.ArrayList;

public class Buzon extends ElementoNavidad{

	   private ArrayList<Carta> cartas;
	    private ArrayList<Niño> ninosBuenos;
	    private int ninosMalosEnviaronCarta;

	    public Buzon () {
	        this.cartas = new ArrayList<>();
	        this.ninosBuenos = new ArrayList<>();
	        this.ninosMalosEnviaronCarta = 0;
	    }
	    private boolean remitenteYaDeposito (Niño Niño) {
	        boolean yaDepositoCarta = false;
	        for (Carta c:this.cartas) {
	            if (c.getPersona().equals(Niño))
	                yaDepositoCarta = true;
	        }
	        return yaDepositoCarta;
	    }

	    public void addCarta (Carta carta) {

	        if (this.remitenteYaDeposito(carta.getPersona()) == false) {
	            if (!this.ninosBuenos.contains(carta.getPersona())) {
	                carta.eliminarRegalos();
	                carta.addRegalo("Trozo de carbon");
	                this.ninosMalosEnviaronCarta++;
	            }
	            this.cartas.add(carta);

	        }
	    }

	    public int getCantidadDeCartasRegalo (String regalo) {
	        int regalos = 0;
	        for (Carta c:this.cartas) {
	            if (c.getRegalos().contains(regalo))
	                regalos++;
	        }
	        return regalos;
	    }
	    
	    
	    public double getPorcentajeDeCartasRegalo (String regalo) {
	        return (this.getCantidadDeCartasRegalo(regalo) / this.cartas.size()) * 100;
	    }
	    public int getNinosMalosEnviaronCarta () {
	        return this.ninosMalosEnviaronCarta;
	    }
	    public int getCantidadCartasRecibidas () {
	        return this.cartas.size();
	    }
	
}
