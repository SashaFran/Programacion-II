package turismo.Comparador;

import java.util.Comparator;
import turismo.PaqueteViaje;


public class ComparadorCosto implements Comparator<PaqueteViaje> {

	@Override
	public int compare(PaqueteViaje o1, PaqueteViaje o2) {
		
	 double d1 = o1.getCosto();
	 double d2 = o2.getCosto();
	 
	 if (d1 > d2 ) {
		 return 1;
	 } else {
		 if (d2 > d1) {
			 return -1;
		 } else {
			 return 0;
		 }
	 }
	 
	}

}
