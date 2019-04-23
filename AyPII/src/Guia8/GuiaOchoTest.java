package Guia8;

import static org.junit.Assert.assertArrayEquals;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class GuiaOchoTest {
	
	@Test
	public void testSerieN() {
		int resultado = GuiaOcho.calcularSerieN(5);
		Assert.assertEquals(15, resultado);
	}
	
	@Test
	public void testFactorialCincoEs120() {
		Assert.assertEquals(120, GuiaOcho.calcularFactorial(5));
	}
	
	@Test
	public void testInvertirCadena() {
		Assert.assertEquals("aloh", GuiaOcho.invertirCadena("hola"));
	}
	
	@Test
	public void testContarElementosDePila() {
		Stack<Integer> pila = new Stack<Integer>();
		pila.push(6);
		pila.push(1);
		pila.push(2);
		pila.push(6);
		pila.push(1);
		Assert.assertEquals(5, GuiaOcho.contarElementosDePila(pila));
		Assert.assertEquals(1, (int) pila.pop());
		Assert.assertEquals(6, (int) pila.pop());
		Assert.assertEquals(2, (int) pila.pop());
		Assert.assertEquals(1, (int) pila.pop());
		Assert.assertEquals(6, (int) pila.pop());
	}
	
	@Test
	public void testMcdEntre45Y25Es5() {
		Assert.assertEquals(5, GuiaOcho.mcdPorEuclides(45, 25));
	}
	
	@Test
	public void test5Por4Es20() {
		Assert.assertEquals(20, GuiaOcho.multiplicacionRecursiva(5, 4));
	}
	
	@Test
	public void test9Por9Es81() {
		Assert.assertEquals(81, GuiaOcho.multiplicacionRecursiva(9, 9));
	}
	
	@Test
	public void testSumaDeVector() {
		int[] arreglo = {1,5,6,7,8};
		Assert.assertEquals(27, GuiaOcho.sumaDeElementosDeVector(arreglo));
	}
	
	@Test
	public void test10EnBinarioEs1010() {
		Assert.assertEquals("1010", GuiaOcho.decimalABinario(10));
	}
	
	@Test
	public void testBusquedaBinariaDos() {
		int[] arreglo = {1,2,3,4,5,6,7,8};
		Assert.assertTrue(GuiaOcho.busquedaBinaria(arreglo, 2));
	}
	
	@Test
	public void testBusquedaBinariaSeis() {
		int[] arreglo = {1,2,3,4,5,6,7,8};
		Assert.assertTrue(GuiaOcho.busquedaBinaria(arreglo, 6));
	}
	
	@Test
	public void testBusquedaBinariaCuatro() {
		int[] arreglo = {1,2,3,4,5,6,7,8};
		Assert.assertTrue(GuiaOcho.busquedaBinaria(arreglo, 4));
	}
	
	@Test
	public void testBusquedaBinariaCero() {
		int[] arreglo = {1,2,3,4,5,6,7,8};
		Assert.assertFalse(GuiaOcho.busquedaBinaria(arreglo, 0));
	}
	
	@Test
	public void testMergeSort() {
		int[] arreglo = {1,5,8,4,0,6,1,20};
		int[] arregloEsperado = {0,1,1,4,5,6,8,20};
		assertArrayEquals(arregloEsperado, GuiaOcho.mergeSort(arreglo));
	}

}
