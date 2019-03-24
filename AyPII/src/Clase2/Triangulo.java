package Clase2;

public class Triangulo extends Figura {
	
	private double base;
	private double altura;
	
	Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return this.base*this.altura;
	}

}
