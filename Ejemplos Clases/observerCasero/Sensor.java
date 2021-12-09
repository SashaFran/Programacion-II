package observerCasero;

public class Sensor extends ElementoObservado{

	private double radiacion;
	
	public Sensor(double radiacion) {
		super();
		this.radiacion = radiacion;
	}
	
	public double getRadiacion() {
		return radiacion;
	}

	public void setRadiacion(double radiacion) {
		double valorViejo = this.radiacion;
		this.radiacion = radiacion;
        this.avisarTodos(valorViejo);
	}
	
	public boolean equals2(Object o1) {
		try {
			Sensor aux = (Sensor)o1;
			return radiacion == aux.getRadiacion();
			
		}catch(Exception e) {
			return false;
		}
	}
	
	
}
