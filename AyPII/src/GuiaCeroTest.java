import junit.framework.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class GuiaCeroTest {

	@Test
	public void DosEsPrimo() {
		Assert.assertTrue(GuiaCero.esPrimo(2));
	}
	
	@Test
	public void SieteEsPrimo() {
		Assert.assertTrue(GuiaCero.esPrimo(7));
	}
	
	@Test
	public void OchoNoEsPrimo() {
		Assert.assertFalse(GuiaCero.esPrimo(8));
	}
	
	@Test
	public void CeroNoEsPrimo() {
		Assert.assertFalse(GuiaCero.esPrimo(0));
	}
	
	@Test
	public void NegativoNoEsPrimo() {
		Assert.assertFalse(GuiaCero.esPrimo(-3));
	}
	
	@Test
	public void SumaDeMultiplosDeTresYCincoDeCeroAUnoEsCero() {
		Assert.assertEquals(0, GuiaCero.sumaDeMultiplosDeTresYCincoHastaN(1));
	}
	
	@Test
	public void SumaDeMultiplosDeTresYCincoDeCeroADiezEsVeintitres() {
		Assert.assertEquals(23, GuiaCero.sumaDeMultiplosDeTresYCincoHastaN(10));
	}
	
	@Test
	public void SumaDeMultiplosDeTresYCincoDeCeroADieciseisEsSesenta() {
		Assert.assertEquals(60, GuiaCero.sumaDeMultiplosDeTresYCincoHastaN(16));
	}
	
	@Test
	public void ArregloUnoDosTresOchoDiezNoEstaOrdenadoDeMayorAMenor() {
		int[] arreglo = {1,2,3,8,10};
		Assert.assertFalse(GuiaCero.arrayEstaOrdenadoDeMayorAMenor(arreglo));
	}
	
	@Test
	public void ArregloVeinteCincoCuatroDosEstaOrdenadoDeMayorAMenor() {
		int[] arreglo = {20,5,4,2};
		Assert.assertTrue(GuiaCero.arrayEstaOrdenadoDeMayorAMenor(arreglo));
	}
	
	@Test
	public void ArregloConUnSoloValorEstaOrdenado() {
		int[] arreglo = {0};
		Assert.assertTrue(GuiaCero.arrayEstaOrdenadoDeMayorAMenor(arreglo));
	}
	
	@Test(expected = Error.class)
	public void ArregloVacioArrojaError() {
		int[] arreglo = {};
		GuiaCero.arrayEstaOrdenadoDeMayorAMenor(arreglo);
	}
	
	@Test(expected = Error.class)
	public void ArregloVacioNoPuedeSumarseYArrojaError() {
		int[] arreglo = {};
		GuiaCero.sumaDeElementosEnPosicionesParesYCero(arreglo);
	}
	
	@Test
	public void ArregloUnoDosTreceCuatroOchoSeisSumaVeintidos() {
		int[] arreglo = {1,2,13,4,8,6};
		Assert.assertEquals(22, GuiaCero.sumaDeElementosEnPosicionesParesYCero(arreglo));
	}
	
	@Test(expected = Error.class)
	public void SumaDeMatricesDeDistintasDimensionesArrojaError() {
		int[][] a = {{1,2,3}, {0,2,0}};
		int[][] b = {{0,0,0}, {1,1,1}, {3,3,3}};
		GuiaCero.sumaDeMatrices(a, b);
	}
	
	@Test
	public void SumaDeMatricesNulasEsMatrizNula() {
		int[][] a = {{0,0,0}, {0,0,0}, {0,0,0}};
		int[][] b = {{0,0,0}, {0,0,0}, {0,0,0}};
		
		int[][] matrizResultante = GuiaCero.sumaDeMatrices(a, b);
		
		for (int i = 0; i < matrizResultante.length; i++) {
			for (int j = 0; j < matrizResultante[0].length; j++) {
				Assert.assertEquals(0, matrizResultante[i][j]);
			}
		}
	}
	
	@Test
	public void SumaDeMatricesIdentidadEsMatrizDiagonalDos() {
		int[][] a = {{1,0,0}, {0,1,0}, {0,0,1}};
		int[][] b = {{1,0,0}, {0,1,0}, {0,0,1}};
		
		int[][] matrizResultante = GuiaCero.sumaDeMatrices(a, b);
		int[][] matrizEsperada = {{2,0,0}, {0,2,0}, {0,0,2}};
		
		for (int i = 0; i < matrizResultante.length; i++) {
			for (int j = 0; j < matrizResultante[0].length; j++) {
				Assert.assertEquals(matrizEsperada[i][j], matrizResultante[i][j]);
			}
		}
	}
	
}
