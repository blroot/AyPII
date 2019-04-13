package Clase7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

import org.junit.Test;

import junit.framework.Assert;

public class AsistenciaDeAlumnosTest {
	
	@Test
	public void testDeAsistencia() {
		
		HashMap<String, ArrayList<String>> listaPorNombres = new HashMap<String, ArrayList<String>>();
		ArrayList<String> diasDeAna = new ArrayList<String>();
		diasDeAna.add("Mie 10");
		diasDeAna.add("Vie 12");
		listaPorNombres.put("Ana", diasDeAna);
		
		ArrayList<String> diasDeLuz = new ArrayList<String>();
		diasDeLuz.add("Vie 12");
		diasDeLuz.add("Mie 17");
		listaPorNombres.put("Luz", diasDeLuz);
		
		ArrayList<String> diasDePedro = new ArrayList<String>();
		diasDePedro.add("Mie 10");
		diasDePedro.add("Mie 17");
		listaPorNombres.put("Pedro", diasDePedro);
		
		HashMap<String, TreeSet<String>> listaPorDia = AsistenciaDeAlumnos.listaPorDia(listaPorNombres);
		
		Assert.assertTrue(listaPorDia.containsKey("Mie 17"));
		Assert.assertTrue(listaPorDia.containsKey("Vie 12"));
		Assert.assertTrue(listaPorDia.containsKey("Mie 10"));
		
		Assert.assertTrue(listaPorDia.get("Mie 17").contains("Luz"));
		Assert.assertTrue(listaPorDia.get("Mie 17").contains("Pedro"));
		
		Assert.assertTrue(listaPorDia.get("Mie 10").contains("Ana"));
		Assert.assertTrue(listaPorDia.get("Mie 10").contains("Pedro"));
		
		Assert.assertTrue(listaPorDia.get("Vie 12").contains("Luz"));
		Assert.assertTrue(listaPorDia.get("Vie 12").contains("Ana"));
		
	}

}
