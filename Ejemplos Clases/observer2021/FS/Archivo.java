package observer2021.FS;

public class Archivo extends Elemento {

  
  
  public void setTamanio(double ss) {
	  tam =ss;
	  this.setChanged();
	  this.notifyObservers();
  }
}
