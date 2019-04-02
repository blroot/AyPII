package Clase4;

public class Elipse extends Figura {
	
	public Punto centro;
	public double radio1;
	public double radio2;
	
	Elipse(double radio1, double radio2, Punto centro) throws RadioNegativoOCeroNoPermitido {
		if (radio1 <= 0.0 || radio2 <= 0.0) {
			throw new RadioNegativoOCeroNoPermitido("No se permite ingresar un radio negativo o cero");
		}
		
		this.radio1 = radio1;
		this.radio2 = radio2;
		this.centro = centro;
	}
	
	public double calcularArea() {
		return Math.PI*this.radio1*this.radio1;
	}
	
	public String toString() {
		return "Elipse de area: " + this.calcularArea();
	}

	@Override
	public void mover(double incrementoX, double incrementoY) {
		this.centro.mover(incrementoX, incrementoY);
	}
	
}
