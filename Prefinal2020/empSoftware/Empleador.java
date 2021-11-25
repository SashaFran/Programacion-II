package empSoftware;

import java.util.ArrayList;


public class Empleador extends ElementoEmp {

	private int  añosAntiguedad;
	private ArrayList<ElementoEmp> elementos;
	
	public Empleador(String nombre, String apellido, int edad, int a){
		super(nombre, apellido, edad);
		this.añosAntiguedad = a;
		this.elementos = new ArrayList<>();
	}
	
	
	public void addProgramador(Programador a){
		if(!elementos.contains(a)){
			elementos.add(a);
		}
	}
	
	public int getAñosAntiguedad() {
		return añosAntiguedad;
	}


	@Override
	public ArrayList<String> getConocimientos() {
		ArrayList<String> aux = new ArrayList<>();
		for (ElementoEmp e: elementos){
			ArrayList<String> union = e.getConocimientos();
			for(String s: union)
				if(!aux.contains(s)){
					aux.add(s);
				}
		}
		return aux;
	}
	
	@Override
	public int Sueldo() {
		int total = 0;
		for (ElementoEmp p: elementos)
			total += p.Sueldo();
		return total;
	}


	@Override
	public String toString() {
		return "Empleador [\nnombre=" + this.getNombre() 
				+ "\napellido=" + this.getApellido()
				+ "\nConocimientos: " +this.getConocimientos() 
				+ "\nelementos=" + elementos + "]";
	}

	@Override
	public ArrayList<ElementoEmp> listaEmpleados() {
		ArrayList<ElementoEmp>listaTotal= new ArrayList<>();
		for (ElementoEmp p: elementos){
			if(!listaTotal.contains(p)){
				listaTotal.addAll(p.listaEmpleados());
				
			}
		}
		return listaTotal;
	}


	@Override
	public int cantEmp() {
		int total = 0;
		for(ElementoEmp e: elementos)
			total += e.cantEmp();
		return total;
	}


}
