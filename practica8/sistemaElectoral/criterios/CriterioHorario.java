package sistemaElectoral.criterios;


import java.time.LocalTime;

import sistemaElectoral.Voto;

public class CriterioHorario extends Criterio {
	LocalTime hora1;
	LocalTime hora2;
	
	public CriterioHorario(LocalTime h1, LocalTime h2) {
		hora1=h1;
		hora2=h2;
	}
	
	
	@Override
	public boolean cumple(Voto voto) {
			return (voto.getHora().compareTo(hora1)>0 && voto.getHora().compareTo(hora2)<0);
	}

}
