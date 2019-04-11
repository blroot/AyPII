package Guia6;

import java.util.Iterator;
import java.util.Stack;

class GuiaSeis {
	
	public static String invertirString(String cadena) {
		
		if (cadena.length() == 0) {
			throw new Error("Debe ingresar una palabra");
		}
		
		Stack<Character> stackDeCaracteres = new Stack<Character>();
		
		for (int i = 0; i < cadena.length(); i++) {
			stackDeCaracteres.add(cadena.charAt(i));
		}
		
		String resultado = "";

		while (!stackDeCaracteres.isEmpty()) {
			resultado += stackDeCaracteres.pop();
		}
		
		return resultado;
		
	}
	
	public static boolean esPalindromo(String cadena) {
		
		return invertirString(cadena).equals(cadena);
		
	}
	
	public static Queue<Integer> combinarColas(Queue<Integer> cola1, Queue<Integer> cola2) {
				
		while (!cola2.isEmpty()) {
			cola1.enqueue(cola2.dequeue());
		}
		
		return cola1;
	}

}
