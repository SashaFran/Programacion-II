
package turismo.Comparador;

import java.util.Comparator;
import turismo.PaqueteViaje;
import java.time.LocalDate;

public class ComparadorFecha implements Comparator<PaqueteViaje> {

	@Override
	public int compare(PaqueteViaje o1, PaqueteViaje o2) {
	
		LocalDate f1 = o1.getFechaPago();
		LocalDate f2 = o2.getFechaPago();
		if (f1!=null) {
			return f1.compareTo(f2);
		}
		if (f2!=null) {
			return -1;
		}
		return 0;
		
	}
	
	

}
