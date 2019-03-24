
public class GuiaCero {
	
	public static boolean esPrimo(int n) {

		if (n <= 0) {
			return false;
		}
		
		if (n == 1 || n == 2) {
			return true;
		}
		
		boolean esPrimo = true;
		
		for (int i = 2; i < n && esPrimo; i++) {
			if (n % i == 0) {
				esPrimo = false;
			}
		}
		return esPrimo;
	}
	
	public static int sumaDeMultiplosDeTresYCincoHastaN(int n) {
		
		int suma = 0;
		
		for (int i = 0; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				suma += i;
			}
		}
		
		return suma;
	}
	
	public static boolean arrayEstaOrdenadoDeMayorAMenor(int[] arreglo) {
		
		if (arreglo.length == 0) {
			throw new Error("El arreglo no puede estar vacio");
		}
		
		boolean estaOrdenado = true;
		
		for (int i = 1; i < arreglo.length; i++) {
			if (arreglo[i-1] < arreglo[i]) {
				estaOrdenado = false;
			}
		}
		
		return estaOrdenado;
	}
	
	public static int sumaDeElementosEnPosicionesParesYCero(int[] arreglo) {
		
		if (arreglo.length == 0) {
			throw new Error("El arreglo no puede estar vacio");
		}
		
		int suma = arreglo[0];
		
		for (int i = 1; i < arreglo.length; i++) {
			if (i % 2 == 0) {
				suma += arreglo[i];
			}
		}
		
		return suma;
	}
	
	public static int[][] sumaDeMatrices(int[][] a, int[][] b) {
		
		if (a.length != b.length || a[0].length != b[0].length) {
			throw new Error("Las matrices deben tener las mismas dimensiones");
		}
		
		int[][] matrizResultante = new int[a.length][a[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				
				matrizResultante[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return matrizResultante;
		
	}
	
	public static int[] intercalarArreglosDeMayorAMenor(int[] a1, int[] a2) {
	
		if (!GuiaCero.arrayEstaOrdenadoDeMayorAMenor(a1)) {
			throw new Error("a1 no esta ordenado de mayor a menor");
		}
		
		if (!GuiaCero.arrayEstaOrdenadoDeMayorAMenor(a2)) {
			throw new Error("a2 no esta ordenado de mayor a menor");
		}
		
		int tamanoResultado = a1.length + a2.length;
		int[] resultado = new int[tamanoResultado];
		int posicionAModificar = 0;
		
		for (int i = 0; i < a1.length; i++) {
			resultado[posicionAModificar] = a1[i];
			posicionAModificar++;
		}
		
		for (int i = 0; i < a2.length; i++) {
			resultado[posicionAModificar] = a2[i];
			posicionAModificar++;
		}
		
		while (!GuiaCero.arrayEstaOrdenadoDeMayorAMenor(resultado)) {
			for (int i = 1; i < resultado.length; i++) {
				if (resultado[i-1] < resultado[i]) {
					int valorTemporal = resultado[i];
					resultado[i] = resultado[i-1];
					resultado[i-1] = valorTemporal;
				}
			}
		}
		
		return resultado;
		
	}
	
	public static String consonantes(String cadena) {
		String frase = new String();
		char[] vocales = "aeiou".toCharArray();
		
		for (int i = 0; i < cadena.length(); i++) {
			
			boolean esVocal = false;
			
			for (int j = 0; j < vocales.length && !esVocal; j++) {
				if (cadena.charAt(i) == vocales[j]) {
					esVocal = true;
				}
			}
			
			if (!esVocal) {
				frase = frase + cadena.charAt(i);
			}
			
		}
		
		return frase;
	}
	
	public static void frecuencias(String cadena) {
		
		char[] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z'};
		
		for (int i = 0; i < abecedario.length; i++) {
			int ocurrencias = 0;
			for (int j = 0; j < cadena.length(); j++) {			
				if (abecedario[i] == cadena.charAt(j)) {
					ocurrencias++;
				}						
			}
			
			if (ocurrencias != 0) {
				System.out.print(abecedario[i] + ": " + ocurrencias + "\n");
			}
		}
	}

}
