package sombreroHogwarts;

import java.util.ArrayList;
import java.util.List;

public class Ravenclaw extends Casa{

	//private ArrayList<Casa> cualidadesCasa;
	
	public Ravenclaw(String nombre, ArrayList<String> cualidadesCasa) {
		super("Ravenclaw", cualidadesCasa);
	}

	@Override
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
