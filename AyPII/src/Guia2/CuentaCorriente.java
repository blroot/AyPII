package Guia2;

public class CuentaCorriente extends Cuenta {
	
	private int[] chequera;
	private final double comisionPorTransferencia;
	
	CuentaCorriente(String nombre, String dni, int[] chequera) {
		super(nombre, dni);
		this.chequera = chequera;
		this.comisionPorTransferencia = 0.03;
	}
	
	CuentaCorriente(String nombre, String dni, int[] chequera, double saldo) {
		super(nombre, dni, saldo);
		this.chequera = chequera;
		this.comisionPorTransferencia = 0.03;
	}
	
	public int[] getChequera() {
		return this.chequera;
	}
	
	public void setChequera(int[] chequera) {
		this.chequera = chequera;
	}
	
	@Override
	public boolean transferir(double monto, Cuenta otra) {
		return super.transferir(monto, monto*comisionPorTransferencia, otra);
	}

}
