package Guia1;

import org.junit.Test;

import junit.framework.Assert;

public class PersonaTest {
	
	@Test
	public void compararP1YP2() {
		Persona p1 = new Persona("José Ramírez Mota", 32);
		Persona p2 = new Persona("Lucas Gómez", 53);
		
		Assert.assertFalse(p1.equals(p2));
	}

	@Test
	public void compararPersonasIgualesTest() {
		Persona p1 = new Persona("José Ramírez Mota", 32);
		Persona p2 = p1;
		
		Assert.assertTrue(p1.equals(p2));
	}
	
	@Test
	public void compararP1YP3() {
		Persona p1 = new Persona("José Ramírez Mota", 32);
		Persona p2 = new Persona("Lucas Gómez", 53);
		Persona p3 = new Persona("José Ramírez Mota", 32);
		
		Assert.assertFalse(p1.equals(p3));
	}
	
}
