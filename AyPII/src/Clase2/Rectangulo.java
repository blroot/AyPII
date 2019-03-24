package Clase2;

public class Rectangulo extends Figura {
	
	public double alto;
	public double ancho;

	Rectangulo(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}
	
	public double calcularArea() {
		return this.alto*this.ancho;
	}
	
}
