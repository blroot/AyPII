package Clase8;

import org.junit.Test;

import junit.framework.Assert;

public class PotenciaTest {
	
	@Test
	public void dosALaCuartaEsDieciseis() {
		Assert.assertEquals(16, Potencia.potencia(2, 4));
	}
	
	@Test
	public void dosALaQuintaEsTreintaydos() {
		Assert.assertEquals(32, Potencia.potencia(2, 5));
	}

}
