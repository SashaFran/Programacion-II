package empSoftware;

import java.util.ArrayList;

public class Programador extends ElementoEmp {

	private ArrayList<String> palabrasClave;
	private CalcularSueldo calcular;
	
	public Programador(String nombre, String apellido, int edad, CalcularSueldo c){
		super(nombre, apellido, edad);
		this.calcular = c;
		this.palabrasClave = new ArrayList<>();
	}

	public CalcularSueldo getC() {
		return calcular;
	}

	
	public void addConocimientos(String e){
			if(!palabrasClave.contains(e)){
				palabrasClave.add(e);
		}
	}
	
	@Override
	public ArrayList<String> getConocimientos() {
		return new ArrayList<String>(palabrasClave);
	}
	
	@Override
	public int Sueldo() {
		return calcular.sueldoFinal();
	}

	@Override
	public boolean equals(Object obj) {
        try {
            Programador p = (Programador) obj;
            return this.getNombre().equals(p.getNombre()) &&
                   this.getApellido().equals(p.getApellido()) &&
            		this.getConocimientos().equals(p.getConocimientos());
        } catch(Exception e) {
            return false;
        }
	}

	@Override
	public String toString() {
		return "\nProgramador [\nnombre=" + this.getNombre() + ", \napellido=" + this.getApellido()
				+ ", \nedad=" + this.getEdad() + ", \npalabrasClave=" + this.getConocimientos();
	}

	@Override
	public ArrayList<ElementoEmp> listaEmpleados(){
		ArrayList<ElementoEmp> p = new ArrayList<>();
			p.add(this);
		return p;
	}

	@Override
	public int cantEmp() {
		return 1;
	}
	
	
}
