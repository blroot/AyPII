package Guia1;

import org.junit.Test;

import junit.framework.Assert;

public class CerraduraConCombinacionTest {
	
	@Test
	public void seConstruyeCerrada() {
		CerraduraConCombinacion cerradura = new CerraduraConCombinacion(0, 2, 8);
		
		Assert.assertTrue(cerradura.estaCerrada());
	}
	
	@Test
	public void noSeAbreConCombinacionIncorrecta() {
		CerraduraConCombinacion cerradura = new CerraduraConCombinacion(0, 2, 8);
		cerradura.abrir(0, 1, 8);
		
		Assert.assertTrue(cerradura.estaCerrada());
	}

	@Test
	public void seAbreConCombinacionCorrecta() {
		CerraduraConCombinacion cerradura = new CerraduraConCombinacion(0, 2, 8);
		cerradura.abrir(0, 2, 8);
		
		Assert.assertFalse(cerradura.estaCerrada());
	}
	
	@Test
	public void noCambiaCombinacionConCombinacionIncorrecta() {
		CerraduraConCombinacion cerradura = new CerraduraConCombinacion(0, 2, 8);
		cerradura.cambiarCombinacion(0, 3, 7, 1, 1, 1);
		cerradura.abrir(1, 1, 1);
		
		Assert.assertTrue(cerradura.estaCerrada());
	}
	
	@Test
	public void cambiaCombinacionConCombinacionCorrecta() {
		CerraduraConCombinacion cerradura = new CerraduraConCombinacion(0, 2, 8);
		cerradura.cambiarCombinacion(0, 2, 8, 1, 1, 1);
		cerradura.abrir(1, 1, 1);
		
		Assert.assertFalse(cerradura.estaCerrada());
	}
	
	@Test
	public void puedoCerrar() {
		CerraduraConCombinacion cerradura = new CerraduraConCombinacion(0, 2, 8);
		cerradura.abrir(0, 1, 8);		
		Assert.assertTrue(cerradura.estaCerrada());
		
		cerradura.cerrar();
		Assert.assertTrue(cerradura.estaCerrada());
	}
	
}
