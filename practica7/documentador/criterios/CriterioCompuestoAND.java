package documentador.criterios;

import documentador.Documento;

public class CriterioCompuestoAND extends Criterio {

	private Criterio criterio, siguiente;
	
	public CriterioCompuestoAND(Criterio c, Criterio siguiente){
		this.criterio = c;
		this.siguiente = siguiente;
	}
	public CriterioCompuestoAND(Criterio c){
		this.criterio = c;
		this.siguiente = null;
	}
	@Override
	public boolean cumple(Documento d1) {
		boolean cumple = criterio.cumple(d1);
		if(cumple && siguiente!=null){
			return siguiente.cumple(d1);
		}else{
		return cumple;
		}
	}

}
