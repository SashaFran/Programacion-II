package sistemaVestimentas;

import java.util.ArrayList;

public abstract class ElementoVestimenta {

	private String nombre;
	
	public ElementoVestimenta(String nombre) {
		super();
		this.nombre = nombre;
	}

	public abstract ArrayList<ElementoVestimenta> listado(Criterio c);
	public abstract String getColor();
	public abstract String getCategoria();
	public abstract String getEstacion();
	public abstract ElementoVestimenta copia();
	

	
	public boolean contieneCategoria(String cat){
		String categorias = this.getCategoria();
		return categorias.contains(cat);
	}
	
	public boolean contieneEstacion(String estacion){
		String est = this.getEstacion();
		return est.contains(estacion);
	}
	
	public boolean contieneColor(String color){
		String c = this.getColor();
		return c.contains(color);
	}
	
	public String getNombre() {
		return nombre;
	}
}
