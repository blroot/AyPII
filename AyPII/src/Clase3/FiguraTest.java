package Clase3;

import org.junit.Test;

import junit.framework.Assert;

public class FiguraTest {

	@Test
	public void AreaDeRectanguloDeDosPorTresEsSeis() {
		Figura rectangulo = new Rectangulo(new Punto(0.0, 0.0), new Punto(2.0, 3.0));
		Assert.assertEquals(6.0, rectangulo.calcularArea());
	}
	
	@Test
	public void AreaDeCuadradoDeCuatroPorCuatroEsDieciseis() {
		Figura cuadrado = new Cuadrado(new Punto(0.0, 0.0), new Punto(4.0, 4.0));
		Assert.assertEquals(16.0, cuadrado.calcularArea());
	}
	
	@Test
	public void AreaDeCirculoDeRadioDosEsCuatroPI() {
		Figura circulo = new Circulo(2.0, new Punto(1.0, 2.4));
		Assert.assertEquals(Math.PI*4.0, circulo.calcularArea());
	}
	
	@Test
	public void AreaDeTrianguloRectanguloDeDosLadosUnoEsUnMedio() {
		Figura triangulo = new Triangulo(new Punto(0.0, 0.0), new Punto(1.0, 0.0), new Punto(0.0, 1.0));
		Assert.assertEquals(0.5, triangulo.calcularArea());
	}
	
	
	
}
