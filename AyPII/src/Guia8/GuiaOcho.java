package Guia8;

import java.util.Stack;

public class GuiaOcho {

	public static int calcularSerieN(int n) {
		if (n == 1) {
			return 1;
		}
		
		return n + calcularSerieN(n-1);
		
	}
	
	public static int calcularFactorial(int n) {
		if (n == 1) {
			return 1;
		}
		
		return n * calcularFactorial(n-1);
		
	}
	
	public static String invertirCadena(String cadena) {
		if (cadena.length() <= 1) {
			return cadena;
		}
				
		return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
		
	}
	
	public static <E> int contarElementosDePila(Stack<E> pila) {
		
		if (pila.isEmpty()) {
			return 0;
		}
		
		// Guardo el item que saco
		E item = pila.pop();
		// Acá se hace la llamada recursiva
		int llamada = 1 + contarElementosDePila(pila);
		// Vuelvo a poner el item en su lugar y retorno
		pila.push(item);
		return llamada;
		
	}
	
}
