package pilaElementos;

public class MainPila {

	public static void main(String[] args){
		Pila a = new Pila();
		
	/*	a.push(new Pila());
		a.push(new Pila());
		a.push(new Pila());
		a.push(new Pila());
		a.push(new Pila()); */
		
		a.push("Elemento 1");
		a.push("Elemento 2");
		a.push("Elemento 3");
		a.push("Elemento 4");
		
		System.out.println(a);
		
		//Elimina ultimo.
		a.pop();
		System.out.println(a);
		
		//regresa el ultimo sin eliminarlo
		a.top();
		System.out.println("Ultimo valor: "+ a.top());
		
		//copia de un array a otro.
		Pila a2 = a.copy();
		System.out.println("Copia: " + a2);
		
		//reversa
		a.reverse();
		System.out.println("Reversa: " + a);
		
	}
}
