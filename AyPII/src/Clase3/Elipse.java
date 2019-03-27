package Clase3;

public class Elipse extends Figura {
	
	public Punto centro;
	public double radio1;
	public double radio2;
	
	Elipse(double radio1, double radio2, Punto centro) {
		this.radio1 = radio1;
		this.radio2 = radio2;
		this.centro = centro;
	}
	
	public double calcularArea() {
		return Math.PI*this.radio1*this.radio1;
	}

	@Override
	public void mover(double incrementoX, double incrementoY) {
		this.centro.mover(incrementoX, incrementoY);
	}
	
}
