package Guia6;

import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

public class GuiaSeisTests {
	
	@Test
	public void testDeInversorDeStrings() {
		Assert.assertEquals("aloh", GuiaSeis.invertirString("hola"));
	}
	
	@Test
	public void seesonoseesEsPalindromo() {
		Assert.assertTrue(GuiaSeis.esPalindromo("seesonosees"));
	}
	
	@Test
	public void celularNoEsPalindromo() {
		Assert.assertFalse(GuiaSeis.esPalindromo("celular"));
	}
	
	@Test
	public void testCombinarDosColas() {
		Queue<Integer> cola1 = new Queue<Integer>();
		Queue<Integer> cola2 = new Queue<Integer>();
		
		cola1.enqueue(1);
		cola1.enqueue(2);
		cola1.enqueue(3);
		
		cola2.enqueue(4);
		cola2.enqueue(5);
		
		Queue<Integer> colaResultante = GuiaSeis.combinarColas(cola1, cola2);
		
		Integer[] arrayParaTest = {1,2,3,4,5};
		int pos = 0;
		
		while (!colaResultante.isEmpty()) {
			Assert.assertEquals(arrayParaTest[pos], colaResultante.dequeue());
			pos++;
		}
		
	}
	
	@Test
	public void testDebeHaberConsistencia() {
		String cadenaDeTags = "[()]{}{[()()]()}";
		
		Assert.assertTrue(GuiaSeis.estaBienBalanceado(cadenaDeTags));
	}
	
	@Test
	public void testNoDebeHaberConsistencia() {
		String cadenaDeTags = "[(])";
		
		Assert.assertFalse(GuiaSeis.estaBienBalanceado(cadenaDeTags));
	}
}
