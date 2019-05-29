package Guia13;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class NegocioTest {
	
	@Test
	public void siempreObtengoLaMismaInstanciaDeNegocio() {
		ArrayList<String> proovedores = new ArrayList<String>();
		proovedores.add("Compumax");
		proovedores.add("Compumundohipermegared");
		
		Producto mouse = new Producto("hjk988", "g9x", "Logitech", proovedores);
		
		Negocio negocio = Negocio.getNegocioInstance();
		negocio.altaDeProducto(mouse, 200);
		
		negocio = Negocio.getNegocioInstance();
		
		assertTrue(negocio.contieneProducto("hjk988"));
	}

}
