package sistemaDelivery;

import java.util.ArrayList;

public class Receta extends ElementoCocina{


	private ArrayList<ElementoCocina> ingredientes;
	private double tiempoCoccion;
	private String modoPreparacion, tipoReceta;
	private int complejidad;
	private double porcentajeExtra;
	
	public Receta(String nombre, double tiempoCoccion,
			String modoPreparacion, String tipoReceta, int complejidad) {
		super(nombre);
		this.tiempoCoccion = tiempoCoccion;
		this.modoPreparacion = modoPreparacion;
		this.tipoReceta = tipoReceta;
		this.complejidad = complejidad;
		this.ingredientes = new ArrayList<>();
	}
	
	public void addIngredientes(ElementoCocina e){
		ingredientes.add(e);
	}

	public double getTiempoCoccion() {
		return tiempoCoccion;
	}

	public String getModoPreparacion() {
		return modoPreparacion;
	}

	public String getTipoReceta() {
		return tipoReceta;
	}

	public int getComplejidad() {
		return complejidad;
	}

	@Override
	public double getCosto() {
		double sumaCosto = 0;
		double total = 0;
		for(ElementoCocina e: ingredientes)
			sumaCosto += e.getCosto();
		total = (sumaCosto*porcentajeExtra) + sumaCosto; 
		return total;
	}

	
	public void setPorcentajeExtra(double porcentajeExtra) {
		this.porcentajeExtra = porcentajeExtra;
	}

	@Override
	public ArrayList<ElementoCocina> getIngrediente() {
		ArrayList<ElementoCocina> aux = new ArrayList<>();
		for(ElementoCocina e: ingredientes)
			aux.addAll(e.getIngrediente());
		return aux;
	}
	
	
	
	

}
