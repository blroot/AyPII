package Guia3.ej3;

import org.junit.Test;

import junit.framework.Assert;

public class FacturaTest {
	
	@Test
	public void FacturaConsumidorFinalTest() {
		FacturaConsumidorFinal factura = new FacturaConsumidorFinal(8, 11, 2019, 
				"Hamburguejas al vapor", 600.0);
		
		Assert.assertEquals(600.0, factura.getMontoTotal());
	}
	
	@Test
	public void FacturaResponsableInscriptoTest() {
		FacturaResponsableInscripto factura = new FacturaResponsableInscripto(8, 11, 2019, 
				"Algún servicio", 600.0);
		
		Assert.assertEquals(90.0, factura.getMontoIIBB());
		Assert.assertEquals(63.0, factura.getMontoIVA());
		Assert.assertEquals(753.0, factura.getMontoTotal());
	}
	
	@Test
	public void FacturaEmpresaTest() {
		FacturaEmpresa factura = new FacturaEmpresa(8, 11, 2019, 
				"Materiales de oficina", 1600.0);
		
		Assert.assertEquals(272.0, factura.getMontoRetenciones());
		Assert.assertEquals(336.0, factura.getMontoIva());
		Assert.assertEquals(2208.0, factura.getMontoTotal());
	}

}
