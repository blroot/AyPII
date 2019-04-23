package Guia8;

import java.util.Arrays;
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
		// Acï¿½ se hace la llamada recursiva
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
	
	public static boolean busquedaBinaria(int[] arreglo, int valor) {
		return busquedaBinariaRecursiva(arreglo, valor, 0, arreglo.length-1);
	}
	
	private static boolean busquedaBinariaRecursiva(int[] arreglo, int valor, int inicio, int fin) {
		
		if (inicio >= fin) {
			return false;
		}
		
		int posicionMedio = (fin+inicio)/2;
				
		if (valor < arreglo[posicionMedio]) {
			return busquedaBinariaRecursiva(arreglo, valor, inicio, posicionMedio-1);
		} else if (valor > arreglo[posicionMedio]) {
			return busquedaBinariaRecursiva(arreglo, valor, posicionMedio+1, fin);
		}
		
		return true;
		
	}
	
	public static int[] mergeSort(int[] arreglo) {
		return mergeSortDivisionYConquista(arreglo);
	}
	
	private static int[] mergeSortDivisionYConquista(int[] arreglo) {	
		// Caso base: si tiene un solo elemento está ordenado
		if (arreglo.length <= 1) {
			return null;
		}
		
		int medio = arreglo.length/2;
		int[] arrayIzquierda = Arrays.copyOfRange(arreglo, 0, medio);
		int[] arrayDerecha = Arrays.copyOfRange(arreglo, medio, arreglo.length);
		
		// Izquierda
		mergeSortDivisionYConquista(arrayIzquierda);
		// Derecha
		mergeSortDivisionYConquista(arrayDerecha);
		merge(arrayIzquierda, arrayDerecha, arreglo);
		
		return arreglo;
	}

	private static void merge(int[] arrayIzquierda, int[] arrayDerecha, int[] arreglo) {
		int i = 0, j = 0, k = 0;
	    while (i < arrayIzquierda.length && j < arrayDerecha.length) {
	        if (arrayIzquierda[i] <= arrayDerecha[j]) {
	        	arreglo[k++] = arrayIzquierda[i++];
	        }
	        else {
	        	arreglo[k++] = arrayDerecha[j++];
	        }
	    }
	    while (i < arrayIzquierda.length) {
	    	arreglo[k++] = arrayIzquierda[i++];
	    }
	    while (j <  arrayDerecha.length) {
	    	arreglo[k++] = arrayDerecha[j++];
	    }
	}
	
}
