package Clase2;

import org.junit.Test;

import junit.framework.Assert;

public class FiguraTest {

	@Test
	public void AreaDeRectanguloDeDosPorTresEsSeis() {
		Figura rectangulo = new Rectangulo(2.0, 3.0);
		Assert.assertEquals(6.0, rectangulo.calcularArea());
	}
	
	@Test
	public void AreaDeCuadradoDeCuatroPorCuatroEsDieciseis() {
		Figura cuadrado = new Cuadrado(4.0);
		Assert.assertEquals(16.0, cuadrado.calcularArea());
	}
	
	@Test
	public void AreaDeCirculoDeRadioDosEsCuatroPI() {
		Figura circulo = new Circulo(2.0);
		Assert.assertEquals(Math.PI*4.0, circulo.calcularArea());
	}
	
}
