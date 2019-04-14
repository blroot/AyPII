package Guia6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

import javax.crypto.spec.PSource;

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
	
	public static boolean estaBienBalanceado(String cadena) {
		
		String[] openTags = {"[", "(", "{"};
		String[] validTag = {"[]", "()", "{}"};
		
		Stack<String> stackDeEnclosings = new Stack<String>();
		
		// Si no comienza con un tag de apertura devuelve false
		String primerTag = cadena.substring(0, 1);
		if (!primerTag.equals(openTags[0]) && !primerTag.equals(openTags[1]) && !primerTag.equals(openTags[2])) {
			return false;
		} else {
			stackDeEnclosings.push(primerTag);
		}
		
		boolean hayConsistencia = true;
		for (int i = 1; i < cadena.length() && hayConsistencia; i++) {
			
			String tagActual = cadena.substring(i, i+1);
			if (tagActual.equals(openTags[0]) || tagActual.equals(openTags[1]) || tagActual.equals(openTags[2])) {
				stackDeEnclosings.push(tagActual);
			} else {
				String ultimoOpenTag = stackDeEnclosings.pop();
				String combinacion = ultimoOpenTag + tagActual;
				hayConsistencia = combinacion.equals(validTag[0]) 
						|| combinacion.equals(validTag[1]) 
						|| combinacion.equals(validTag[2]);
			}
			
		}
		
		return hayConsistencia;
		
	}
	
	// Ejs listas
	
	public static ArrayList<Integer> combinarListasDeEnteros(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
		ArrayList<Integer> listaResultante = new ArrayList<Integer>();
		
		Iterator<Integer> iteradorLista1 = lista1.iterator();
		Iterator<Integer> iteradorLista2 = lista2.iterator();
		
		while (iteradorLista1.hasNext()) {
			listaResultante.add(iteradorLista1.next());
		}
		while (iteradorLista2.hasNext()) {
			listaResultante.add(iteradorLista2.next());
		}
		
		Collections.sort(listaResultante);
				
		return listaResultante;
	}
	
	public static ArrayList<Integer> eliminarEnterosDuplicados(ArrayList<Integer> lista) {
		ArrayList<Integer> listaResultante = new ArrayList<Integer>();
		Iterator<Integer> iterador = lista.listIterator(0);
		
		// Llevo una posicion para llevar el iterador a la posicion necesaria
		int posicion = 0;
		while (iterador.hasNext()) {
			Integer enteroActual = iterador.next();
			// Se agrega el entero a la lista y se salta una posicion
			listaResultante.add(enteroActual);
			posicion++;
			
			// Para comparar comienzo desde el siguiente entero
			iterador = lista.listIterator(posicion);
			while (iterador.hasNext()) {
				Integer otroEntero = iterador.next();
				if (enteroActual.equals(otroEntero)) {
					iterador.remove();
				}
			}
		}
		
		return listaResultante;
		
	}

}
