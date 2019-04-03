package Guia4;

public class SumaPorStrings {

	public static int sumar(String[] cadena) {
		int suma = 0;
		
		try {
			for (int i = 0; i < cadena.length; i++) {
				int entero = Integer.parseInt(cadena[i]);
				suma += entero;
			}
		} catch (NumberFormatException e) {
			System.out.println("No se ha podido convertir la cadena a entero");
		} finally {
			System.out.println("Programa finalizado...");
		}
 		
		return suma;
	}
	
}
