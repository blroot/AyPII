package Guia4.ej2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class examenDemo {

	public static void main(String[] args) {
				
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese la fecha: ");
			String fecha = in.readLine();
			System.out.println("Ingrese el nombre del estudiante: ");
			String nombreAlumno = in.readLine();
			System.out.println("Ingrese el legajo del estudiante: ");
			int legajo = Integer.parseInt(in.readLine());
			System.out.println("Ingrese la nota: ");
			int nota = Integer.parseInt(in.readLine());
			
			Examen examen = new Examen(nombreAlumno, fecha, legajo, nota);
		} catch (ErrorNotaInvalida e) {
			System.out.println(e.getMessage());
		} catch (ErrorNumeroDeLegajo e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Error: Se esperaba un número entero");
		} catch (IOException e) {
			System.out.println("Error: Error al leer entrada");
		} finally {
			System.out.println("Fin de carga de exámen");
		}
		
	}

}
