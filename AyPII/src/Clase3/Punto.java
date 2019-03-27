package Clase3;

public class Punto implements Movible {

	private double posicionX;
	private double posicionY;
	
	Punto(double posicionX, double posicionY) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}
	
	public double getPosicionX() {
		return this.posicionX;
	}
	
	public double getPosicionY() {
		return this.posicionY;
	}

	@Override
	public void mover(double incrementoX, double incrementoY) {
		this.posicionX += incrementoX;
		this.posicionY += incrementoY;
	}
	
}
