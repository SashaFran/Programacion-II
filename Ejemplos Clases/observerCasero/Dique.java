package observerCasero;


public class Dique extends ElementoObservado{

	double nivelAgua;

	public double getNivelAgua() {
		return nivelAgua;
	}

	public void setNivelAgua(double nievelAgua) {
		double valorViejo = this.nivelAgua;
		this.nivelAgua = nievelAgua;
		this.avisarTodos(valorViejo);
	}
	
	
	
	
}
