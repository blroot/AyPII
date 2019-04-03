package Guia4.ej1;

import org.junit.Test;

import junit.framework.Assert;

public class SumaPorStringsTest {
	
	@Test
	public void sumarUnoDosYTresDaSeis() {
		String[] cadena = {"1", "2", "3"};
		int total = SumaPorStrings.sumar(cadena);
		Assert.assertEquals(6, total);
	}
	
	@Test
	public void sumarUnoDosYADaTres() {
		String[] cadena = {"1", "2", "A"};
		int total = SumaPorStrings.sumar(cadena);
		Assert.assertEquals(3, total);
	}

}
