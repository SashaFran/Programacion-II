package sistemaElectoral;

import java.util.ArrayList;

public class GrupoMesas extends ElementoVotante {

	private ArrayList<ElementoVotante> entidades;

	@Override
	public ArrayList<Voto> getListaVotosPorCriterio(Criterio c) {
		ArrayList<Voto> resultado = new ArrayList<Voto>();
		for (ElementoVotante entidad : entidades) {
			resultado.addAll(entidad.getListaVotosPorCriterio(c));
		}
		return resultado;
	}

	@Override
	public int getCantidadTotalVotosEmitidos() {
		int cantidad = 0;
		for (ElementoVotante entidad : entidades) {
			cantidad += entidad.getCantidadTotalVotosEmitidos();
		}
		return cantidad;
	}
}
