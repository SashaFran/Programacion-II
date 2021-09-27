package sombreroHogwarts;

import java.util.ArrayList;
import java.util.List;

public class Slytherin extends Casa{

	//private ArrayList<Casa> cualidadesCasa;
	
	public Slytherin(String nombre, ArrayList<String> cualidadesCasa) {
		super("Slytherin", cualidadesCasa);
		// TODO Auto-generated constructor stub
	}

	
	public void addAlumno(Alumno al) {
		for (int i=0; i < MAX; i++){
			//y si es sangrepura.
			if((compare())/*&&(isSangrePura()*/){
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
