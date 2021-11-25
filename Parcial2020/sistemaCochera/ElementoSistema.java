package sistemaCochera;

import java.util.ArrayList;

import sistemaCochera.Filtro.Filtro;

public abstract class ElementoSistema {

	
	public abstract ArrayList<Cochera> getCocheras(Filtro f,Auto a);	
	public abstract int cantCocheras();
	public abstract ElementoSistema copia(Filtro f);
	
}
