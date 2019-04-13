package Clase7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

class AsistenciaDeAlumnos {

	public static HashMap<String, TreeSet<String>> listaPorDia(HashMap<String, ArrayList<String>> listaPorNombre) {
				
		HashMap<String, TreeSet<String>> hashMapResultante = new HashMap<String, TreeSet<String>>();
		
		for (String alumno : listaPorNombre.keySet()) {
			for (String fecha : listaPorNombre.get(alumno)) {
				
				if (!hashMapResultante.containsKey(fecha)) {
					hashMapResultante.put(fecha, new TreeSet<String>());
				}
				hashMapResultante.get(fecha).add(alumno);
				
			}
		}
		
		System.out.println(hashMapResultante);
		
		return hashMapResultante;
		
	}
	
}
