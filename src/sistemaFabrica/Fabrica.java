package sistemaFabrica;

import java.util.ArrayList;

public class Fabrica {


	private Criterio criterio;
	private ArrayList<Pedido> pedidosEnCurso;
	

    public Fabrica(Criterio criterio) {
		super();
		this.criterio = criterio;
		this.pedidosEnCurso = new ArrayList<>();
	}

	public boolean aceptas(Pedido m){
        return criterio.acepta(m);
    }
	
	public void tomaPedido(Pedido m){
		pedidosEnCurso.add(m);
	}
	
	public Criterio getCriterio() {
		return criterio;
	}

	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}
	
}
