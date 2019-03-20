import junit.framework.Assert;

import org.junit.Test;

public class TestRectangulo {
	
	@Test
	public void PuntoEstaDentroDelReactangulo() {
		Rectangulo rectangulo = new Rectangulo(3, 2);
		boolean resultado = rectangulo.contieneA(1, 1);
		Assert.assertTrue(resultado);
	}
}
