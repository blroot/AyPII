
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
			if (arreglo[i-1] <= arreglo[i]) {
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
	
	//public static int[] intercalarArreglosDeMayorAMenor(int[] a1, int[] a2) {
	// 
	//}

}
