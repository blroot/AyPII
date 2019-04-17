package Clase8;

public class Potencia {
	
	public static int potencia(int x, int n) {
		return potenciaPorDivisionYConquista(x, n);
	}
	
	private static int potenciaPorDivisionYConquista(int x, int n) {
		if (n == 0) {
			return 1;
		}
		
		int resultado = potenciaPorDivisionYConquista(x, n/2);
		if (n % 2 == 0) {
			return resultado * resultado;
		} else {
			return resultado * resultado * x;
		}
		
	}
 	
}
