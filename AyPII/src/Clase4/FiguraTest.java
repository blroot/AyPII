package Clase4;

import org.junit.Test;

import junit.framework.Assert;

public class FiguraTest {

	@Test
	public void AreaDeRectanguloDeDosPorTresEsSeis() {
		try {
			Figura rectangulo = new Rectangulo(new Punto(0.0, 0.0), new Punto(2.0, 3.0));
			Assert.assertEquals(6.0, rectangulo.calcularArea());
		} catch (LadoNegativoOCeroNoPermitido e) {
			
		}
	}
	
	@Test
	public void AreaDeCuadradoDeCuatroPorCuatroEsDieciseis() {
		try {
			Cuadrado cuadrado = new Cuadrado(new Punto(0.0, 0.0), new Punto(4.0, 4.0));
			Assert.assertEquals(16.0, cuadrado.calcularArea());
		} catch (LadoNegativoOCeroNoPermitido e) {
			
		}
	}
	
	@Test
	public void AreaDeCirculoDeRadioDosEsCuatroPI() {
		try {
			Figura circulo = new Circulo(2.0, new Punto(1.0, 2.4));
			Assert.assertEquals(Math.PI*4.0, circulo.calcularArea());
		} catch (RadioNegativoOCeroNoPermitido e) {
			
		}
	}
	
	@Test
	public void AreaDeTrianguloRectanguloDeDosLadosUnoEsUnMedio() {
		try {
			Figura triangulo = new Triangulo(new Punto(0.0, 0.0), new Punto(1.0, 0.0), new Punto(0.0, 1.0));
			Assert.assertEquals(0.5, triangulo.calcularArea());
		} catch (ViolacionDeDesigualdadTriangular e) {
			
		}
	}
	
	
	
}
