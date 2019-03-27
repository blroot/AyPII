package Guia2;

import org.junit.Test;

import junit.framework.Assert;

public class CuentaTest {
	
	@Test
	public void crearCajaDeAhorroConSaldo4000() {
		CajaDeAhorro cajaDeAhorro = new CajaDeAhorro("Esteban Quito", "23354678", 4000.0);
		Assert.assertEquals(4000.0, cajaDeAhorro.getSaldo());
	}
	
	@Test
	public void transferenciaDe500EntreCajasDeAhorro() {
		CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro("Esteban Quito", "23354678", 4000.0);
		CajaDeAhorro cajaDeAhorro2 = new CajaDeAhorro("Esteban Elco", "23354674");
		boolean transferenciaExitosa = cajaDeAhorro1.transferir(500.0, cajaDeAhorro2);
		Assert.assertEquals(true, transferenciaExitosa);
		Assert.assertEquals(3500.0, cajaDeAhorro1.getSaldo());
		Assert.assertEquals(500.0, cajaDeAhorro2.getSaldo());
	}
	
	@Test
	public void transferenciaDe500EntreCuentasCorrientes() {
		int[] chequera1 = {1234, 1235, 1236, 1237, 1238};
		int[] chequera2 = {1239, 1240, 1241, 1242, 1243};
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente("Esteban Quito", "23354678", chequera1, 515.0);
		CuentaCorriente cuentaCorriente2 = new CuentaCorriente("Esteban Elco", "23354674", chequera2);
		boolean transferenciaExitosa = cuentaCorriente1.transferir(500.0, cuentaCorriente2);
		Assert.assertEquals(true, transferenciaExitosa);
		Assert.assertEquals(0.0, cuentaCorriente1.getSaldo());
		Assert.assertEquals(500.0, cuentaCorriente2.getSaldo());
	}
	
	@Test
	public void transferenciaSinFondosSuficientesNoEsExitosa() {
		CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro("Esteban Quito", "23354678", 4000.0);
		CajaDeAhorro cajaDeAhorro2 = new CajaDeAhorro("Esteban Elco", "23354674");
		boolean transferenciaExitosa = cajaDeAhorro1.transferir(5000.0, cajaDeAhorro2);
		Assert.assertFalse(transferenciaExitosa);
	}
	
	@Test(expected = Error.class)
	public void transferirAMismaCuentaDaError() {
		CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro("Esteban Quito", "23354678", 4000.0);
		cajaDeAhorro1.transferir(20.0, cajaDeAhorro1);
	}
	
	@Test(expected = Error.class)
	public void construirConSaldoNegativoDaError() {
		new CajaDeAhorro("Esteban Quito", "23354678", -2.0);
	}
	
	@Test
	public void aplicarInteresACajaDeAhorroConSaldo350ResultaSaldo367Con50() {
		CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro("Esteban Quito", "23354678", 350.0);
		cajaDeAhorro1.aplicarInteres();
		Assert.assertEquals(cajaDeAhorro1.getSaldo(), 367.5);
	}

}
