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
		// Ac� se hace la llamada recursiva
		int llamada = 1 + contarElementosDePila(pila);
		// Vuelvo a poner el item en su lugar y retorno
		pila.push(item);
		return llamada;
		
	}
	
	public static int mcdPorEuclides(int a, int b)  {
		
		if (b == 0) {
			return a;
		}
		
		return mcdPorEuclides(b, a % b);
		
	}
	
	public static int multiplicacionRecursiva(int a, int b) {
		
		if (b == 0) {
			return 0;
		}
		
		return a + multiplicacionRecursiva(a, b-1);
		
	}
	
	public static int sumaDeElementosDeVector(int[] arreglo) {
		int fin = 0;
		return sumaDeElementosDeVectorRecursiva(arreglo, fin);
	}
	
	private static int sumaDeElementosDeVectorRecursiva(int[] arreglo, int fin) {
		
		if (fin == arreglo.length) {
			return 0;
		}
		
		return arreglo[fin] + sumaDeElementosDeVectorRecursiva(arreglo, fin+1);
		
	}
	
	public static String decimalABinario(int a) {
		
		if (a == 2) {
			return "10";
		}
		
		return decimalABinario(a / 2) + Integer.toString((a % 2));
		
	}
}
