package Guia2;

import org.junit.Test;

import junit.framework.Assert;

public class empleadoDeCocinaTest {
	
	@Test
	public void ayudanteDeCocinaPuedePelarPapas() {
		AyudanteDeCocina ayudante = new AyudanteDeCocina("35678908", 7, 4, 2019, 0);
		Assert.assertEquals("Papa pelada", ayudante.pelarPapa());
	}
	
	@Test
	public void cocineroPuedeCocinarYArmarPlato() {
		Cocinero cocinero = new Cocinero("35678908", 7, 4, 2019, 0);
		Assert.assertEquals("Pieza cocida", cocinero.cocinar());
		Assert.assertEquals("Plato armado", cocinero.armarPlato());
	}
	
	@Test
	public void lavacopasPuedeLavarCopas() {
		Lavacopas lavacopas = new Lavacopas("35678908", 7, 4, 2019, 0);
		Assert.assertEquals("Copa lavada", lavacopas.lavarCopa());
	}
	
	@Test(expected = Error.class)
	public void dniVacioDaError() {
		new Lavacopas("", 7, 4, 2019, 0);
	}
	
	@Test(expected = Error.class)
	public void antiguedadNegativaDaError() {
		new Lavacopas("35467567", 7, 4, 2019, -1);
	}

}
