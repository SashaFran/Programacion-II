package parcialFormulaMatematica;
import java.util.ArrayList;

public class Expresion  extends ElementMatematico{
	ElementMatematico expresion1;
	ElementMatematico expresion2;
	Operador operador;
	
	
	public Expresion (ElementMatematico ex1, ElementMatematico ex2,Operador o) {
		expresion1=ex1;
		expresion2=ex2;
		operador=o;
	}
	
	
	public double getValor() {
		return operador.realizarOperacion(expresion1.getValor(), expresion2.getValor());
	}
	
	public double getOpuesto() {
		return operador.realizarOperacionOpuesta(expresion1.getOpuesto(), expresion2.getOpuesto());
	}

	@Override
	public String toString() {
		return  "("+expresion1.toString() +" "+ operador.getSimbolo() +" "+  expresion2.toString()+")";
	}


	@Override
	public ArrayList<Double> listarNumeros() {
		ArrayList<Double>lista= new ArrayList<>();
		lista.addAll(expresion1.listarNumeros());
		lista.addAll(expresion2.listarNumeros());
		
		return lista;
	}


	@Override
	public ArrayList<String> operadores() {
		ArrayList<String>lista= new ArrayList<>();
		lista.addAll(this.expresion1.operadores());
		lista.add(this.operador.getSimbolo());
		lista.addAll(expresion2.operadores());
		
		return lista;
	}
	
	
	
}
