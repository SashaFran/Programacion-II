package sistemaDelivery;

import java.util.ArrayList;

public class SeccionCocina  {

	private ArrayList<Ingrediente> stockIngredientes;
	private Criterio criterio;
	
	public SeccionCocina(Criterio c) {
		this.stockIngredientes = new ArrayList<>();
		this.criterio = c;
	}
	
	public void addStock(Ingrediente e){
		stockIngredientes.add(e);
	}
	
	public ArrayList<Ingrediente> getStockIngredientes() {
		return new ArrayList<Ingrediente>(stockIngredientes);
	}

	public boolean aceptaReceta(Receta r){
		//vamos a dejarlo asi por ahora a ver si funciona
		if(criterio.acepta(r)){
			if(r.getIngrediente().contains(stockIngredientes))
				System.out.println("Ingredientes: " + r.getIngrediente());
			//System.out.println("Ingredientes cocina: " + this.getStockIngredientes());
			
				stockIngredientes.removeAll(r.getIngrediente());
			//Puede llamar a un metodo mensaje para que lo reproduzca aca if true;
				System.out.println("Acepta");
				return true;
				
		}else{
			System.out.println("No acepta");
			return false;
		}
			
	}



	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}

	public Criterio getCriterio() {
		return criterio;
	}
	

	
	


}
