package parcial;

import java.util.ArrayList;

import parcial.Criterios.Criterio;

public abstract class ElementoHabitantes {

		private String nombre;
		
		public abstract int cantHabitantes();
		public abstract int totalIngresos();
		public abstract double superficieTotal();
		public abstract ArrayList<ElementoSimple> buscar(Criterio c);
		
		public String getNombre() {
			return nombre;
		}
		
		public double ingresos() {
			return this.totalIngresos()/this.cantHabitantes();
		}
		
		public double densidad() {
			return this.cantHabitantes() / this.superficieTotal();
		}
}
