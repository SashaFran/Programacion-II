package observerFileSystem;


import java.util.Observable;

public abstract class ElementoFS extends Observable{

	double tam;
	//java.beans.PropertyChangeSupport support;
	
	public ElementoFS() {
	//	support = new java.beans.PropertyChangeSupport(this);
	//	support.addPropertyChangeListener(listener);
	//	support.removePropertyChangeListener(listener);
	//	support.firePropertyChange(propertyName, oldValue, newValue);
	}
	
	
	public  double getTamaño() {
		return tam;
		
	};
	
	// ES UN EJEMPLO FALTA EL RESTO DE METODOS DE ELEMENTO FS
}
