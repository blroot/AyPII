package Guia2;

public class CajaDeAhorro extends Cuenta {
	
	private final double tasaDeInteres;

	CajaDeAhorro(String nombre, String dni) {
		super(nombre, dni);
		this.tasaDeInteres = 0.05;
	}	
	
	CajaDeAhorro(String nombre, String dni, double saldo) {
		super(nombre, dni, saldo);
		this.tasaDeInteres = 0.05;
	}
	
	public void aplicarInteres() {
		this.setSaldo(this.getSaldo() + this.getSaldo()*this.tasaDeInteres);
	}
	
}
