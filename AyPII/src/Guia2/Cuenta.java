package Guia2;

public class Cuenta {

	private String dni;
	private String nombre;
	private double saldo;
	
	Cuenta(String nombre, String dni, double saldo) {
		if (nombre.length() == 0) {
			throw new Error("El nombre no puede estar vacío");
		}
		if (dni.length() == 0) {
			throw new Error("EL dni no puede estar vacío");
		}
		if (saldo < 0.0) {
			throw new Error("El saldo no puede ser negativo");
		}
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	Cuenta(String nombre, String dni) {
		if (nombre.length() == 0) {
			throw new Error("El nombre no puede estar vacío");
		}
		if (dni.length() == 0) {
			throw new Error("EL dni no puede estar vacío");
		}
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean transferir(double monto, double comision, Cuenta otra) {
		if (monto > this.getSaldo()) {
			return false;
		}
		
		if (this == otra) {
			throw new Error("No se permite transferir dinero hacia la misma cuenta");
		}
		
		this.setSaldo(this.getSaldo() - monto - comision);
		otra.setSaldo(otra.getSaldo() + monto);
		
		return true;
	}
	
	public boolean transferir(double monto, Cuenta otra) {
		return this.transferir(monto, 0.0, otra);
	}
	
}
