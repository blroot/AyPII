package Guia8;

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

}
