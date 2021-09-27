package sombreroHogwarts;

import java.util.ArrayList;
import java.util.List;

public class Hufflepuff extends Casa{
	
	//private ArrayList<Casa> cualidadesCasa;

	public Hufflepuff(String nombre, ArrayList<String> cualidadesCasa) {
		super("Hufflepuff", cualidadesCasa);
		// TODO Auto-generated constructor stub
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
