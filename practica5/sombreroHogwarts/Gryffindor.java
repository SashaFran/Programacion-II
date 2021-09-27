package sombreroHogwarts;

import java.util.ArrayList;
import java.util.List;

public class Gryffindor extends Casa{


	public Gryffindor(String nombre, ArrayList<String> cualidadesCasa) {
		super("Gryffindor", cualidadesCasa);
	}

	public void addAlumno(Alumno al) {
		for (int i=0; i < MAX; i++){
			if(compare()){
				alumnos.add(al);
			}
		}
	}

	@Override
	public boolean compare() {
		if (super.getCualidadesCasa() == this.getCualidadesCasa()){
			return true;
		}else{
			return false;
		}
	}

	public List<String> setCualidadesCasa() {
		return new ArrayList<String>();
	}
	
	


}
