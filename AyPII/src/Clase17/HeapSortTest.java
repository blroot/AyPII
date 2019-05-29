package Clase17;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class HeapSortTest {

	@Test
	public void testOrdenarArrayDeEnteros() {
		Integer[] arrayDeEnteros = {1, 5, 0, -2, 8, 6};
		Integer[] arrayOrdenado = {-2, 0, 1, 5, 6, 8};
		
		HeapSort.heapsort(arrayDeEnteros);
		
		for (int i = 0; i < arrayDeEnteros.length; i++) {
			System.out.println(arrayDeEnteros[i]);
		}
		
		assertArrayEquals(arrayOrdenado, arrayDeEnteros);
	}
	
}
