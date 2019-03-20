import junit.framework.Assert;

import org.junit.Test;


public class TestClase1 {
	
	@Test
	public void trianguloTest() {
		boolean resultado = EjercicioUno.comprobarTriangulo(2, 3, 4);
		Assert.assertTrue(resultado);
	} 
	
	@Test
	public void trianguloTestConNumerosNegativos(){
		boolean resultado = EjercicioUno.comprobarTriangulo(-2, 3, 4);
		Assert.assertFalse(resultado);
	}
	
	@Test
	public void trianguloTestConCero(){
		boolean resultado = EjercicioUno.comprobarTriangulo(0, 3, 4);
		Assert.assertFalse(resultado);
	}
	
	@Test
	public void AreaEsferaRadioPositivo(){
		double area = EjercicioUno.areaEsfera(1);
		Assert.assertEquals((4/3)*Math.PI, area);
	}
	
	@Test(expected = Error.class)
	public void AreaEsferaRadioNegativo(){
		EjercicioUno.areaEsfera(-51);
	}
	
	@Test(expected = Error.class)
	public void AreaEsferaRadioCero(){
		EjercicioUno.areaEsfera(0);
	}
	
	@Test
	public void distanciaEntreCeroCeroYUnoUno() {
		double resultado = EjercicioUno.distanciaEntreDosPuntos(0.0, 1.0, 1.0, 1.0);
		Assert.assertEquals(1.0, resultado);
	}
	
	@Test
	public void distanciaEntreCeroDos() {
		double resultado = EjercicioUno.distanciaEntreDosPuntos(0.0, 2.0, 2.0, 2.0);
		Assert.assertEquals(2.0, resultado);
	}
	
	@Test
	public void distanciaEntreMenosCeroDos() {
		double resultado = EjercicioUno.distanciaEntreDosPuntos(0.0, -2.0, -2.0, -2.0);
		Assert.assertEquals(2.0, resultado);
	}
	
	@Test
	public void sumaDeArreglo(){
		int[] arreglo = {2,4,5,6,7};
		int resultado = EjercicioUno.sumaDeNumerosPares(arreglo);
		Assert.assertEquals(12, resultado);
	}
	@Test
	public void sumaDeArreglo2(){
		int[] arreglo = {2,4,5,6,7,8};
		int resultado = EjercicioUno.sumaDeNumerosPares(arreglo);
		Assert.assertEquals(20, resultado);
	}
	
}

