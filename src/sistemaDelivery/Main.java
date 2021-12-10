package sistemaDelivery;

public class Main {

	public static void main(String[] args) {
		
		
		
		//String nombre, double tiempoCoccion, String modoPreparacion, String tipoReceta, int complejidad
		Receta rr = new Receta("Ensalada atun", 20.0, "Crudo", "Ensalada", 2);
		Receta r1 = new Receta("Vitel tone", 300.0, "Horno", "Navideño", 10);
		Receta r2 = new Receta("Turron", 100.0, "Horno", "Postre", 4);
		Receta r3 = new Receta("Papas fritas", 60.0, "Frito", "Acompañamiento", 2);
		Receta r4 = new Receta("Wrap de pollo", 100.0, "Frito", "Aperitivo", 5);
		
		Ingrediente ii = new Ingrediente("Mayonesa", 215.0);
		Ingrediente i1 = new Ingrediente("Vinagre", 35.0);
		Ingrediente i2 = new Ingrediente("Peceto", 1215.0);
		Ingrediente i3 = new Ingrediente("Crema de Leche", 315.0);
		Ingrediente i4 = new Ingrediente("Caldito knor", 115.0);
		
		r1.addIngredientes(ii);
		r1.addIngredientes(i1);
		r1.addIngredientes(i2);
		r1.addIngredientes(i3);
		r1.addIngredientes(i4);
		
		CriterioReceta cr = new CriterioReceta("Navideño");
		SeccionCocina ss = new SeccionCocina(cr);
		ss.addStock(ii);
		ss.addStock(i1);
		ss.addStock(i2);
		ss.addStock(i3);
		ss.addStock(i4);
		System.out.println("Stock: "+ss.getStockIngredientes());
		
		
		ss.aceptaReceta(r1);
		//FUNCIONA EL DELETE.
		//System.out.println("Stock: "+ss.getStockIngredientes());
		
	}

}
