package Clase2;

public class Elipse extends Figura {

	public double radio1;
	public double radio2;
	
	Elipse(double radio1, double radio2) {
		this.radio1 = radio1;
		this.radio2 = radio2;
	}
	
	public double calcularArea() {
		return Math.PI*this.radio1*this.radio1;
	}
	
}
