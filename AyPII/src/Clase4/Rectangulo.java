package Clase4;

public class Rectangulo extends Figura {
	
	public Punto esquina1;
	public Punto esquina2;
	public double alto;
	public double ancho;

	public Rectangulo(Punto esquina1, Punto esquina2) throws LadoNegativoOCeroNoPermitido {
		this.esquina1 = esquina1;
		this.esquina2 = esquina2;
		this.alto = Math.abs(this.esquina2.getPosicionY() - this.esquina1.getPosicionY());
		this.ancho = Math.abs(this.esquina2.getPosicionX() - this.esquina1.getPosicionX());
		
		if (this.alto == 0.0 || this.ancho == 0.0) {
			throw new LadoNegativoOCeroNoPermitido("Los lados deben ser mayores a cero");
		}
	}
	
	public String toString() {
		return "Rectángulo de area: " + this.calcularArea();
	}
	
	public double calcularArea() {
		return this.alto*this.ancho;
	}

	@Override
	public void mover(double incrementoX, double incrementoY) {
		this.esquina1.mover(incrementoX, incrementoY);
		this.esquina2.mover(incrementoX, incrementoY);
	}
	
}
