package Guia3;

import java.util.Arrays;

public class integrantesComputacion {

	public static void main(String[] args) {
		
		Integrante[] integrantes = new Integrante[9];
		
		System.out.println("Listado de Integrantes: ");
		
		integrantes[0] = new Docente("Ricardo", "Cinzano", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20, 32500.0);
		integrantes[1] = new Docente("Norberto", "Martini", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20, 32500.0);
		integrantes[2] = new Adscripto("Rafa", "Gorgory", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20333, 8.0, 3000.0, 1);
		integrantes[3] = new Alumno("Lalo", "Landa", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20459, 7.3);
		integrantes[4] = new Alumno("Lisa", "Simpson", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20455, 10.0);
		integrantes[5] = new Alumno("Cosme", "Fulanito", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 18346, 5.7);
		integrantes[6] = new Adscripto("Nelson", "Muntz", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20566, 9.0, 4000.0, 2);
		integrantes[7] = new Adscripto("Abe", "Simpson", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20560, 7.7, 2000.0, 3);
		integrantes[8] = new Docente("Edna", "Clavados", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20, 32500.0);
		
		Arrays.sort(integrantes);
		
		for (int i = 0; i < integrantes.length; i++) {
			System.out.println(integrantes[i]);
		}
		
		System.out.println("Listado de Alumnos: ");
		
		Alumno[] alumnos = new Alumno[6];

		alumnos[0] = new Adscripto("Rafa", "Gorgory", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20333, 8.0, 3000.0, 1);
		alumnos[1] = new Alumno("Lalo", "Landa", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20459, 7.3);
		alumnos[2] = new Alumno("Lisa", "Simpson", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20455, 10.0);
		alumnos[3] = new Alumno("Cosme", "Fulanito", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 18346, 5.7);
		alumnos[4] = new Adscripto("Nelson", "Muntz", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20566, 9.0, 4000.0, 2);
		alumnos[5] = new Adscripto("Abe", "Simpson", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20560, 7.7, 2000.0, 3);
		
		Arrays.sort(alumnos, new ComparadorDeAlumnos());
		
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}
		
		Remunerado[] docentes = new Remunerado[6];
		
		System.out.println("Listado de Docentes y Adscriptos: ");
		
		docentes[0] = new Docente("Ricardo", "Cinzano", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20, 32500.0);
		docentes[1] = new Docente("Norberto", "Martini", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20, 32500.0);
		docentes[2] = new Adscripto("Rafa", "Gorgory", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20333, 8.0, 3000.0, 1);
		docentes[3] = new Adscripto("Nelson", "Muntz", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20566, 9.0, 4000.0, 2);
		docentes[4] = new Adscripto("Abe", "Simpson", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20560, 7.7, 2000.0, 3);
		docentes[5] = new Docente("Edna", "Clavados", "11890345", "callefalsa 123", "45673333", 
				8, 12, 1976, 20, 32500.0);
		
		Arrays.sort(docentes, new ComparadorDeDocentes());
		
		for (int i = 0; i < docentes.length; i++) {
			System.out.println(docentes[i]);
		}
		
	}

}
