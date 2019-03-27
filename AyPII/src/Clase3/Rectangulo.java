package Clase3;

public class Rectangulo extends Figura {
	
	public Punto esquinaInferiorIzquierda;
	public Punto esquinaSuperiorDerecha;
	public double alto;
	public double ancho;

	public Rectangulo(Punto esquinaInferiorIzquierda, Punto esquinaSuperiorDerecha) {
		this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
		this.esquinaSuperiorDerecha = esquinaSuperiorDerecha;
		this.alto = this.esquinaSuperiorDerecha.getPosicionY() - this.esquinaInferiorIzquierda.getPosicionY();
		this.ancho = this.esquinaSuperiorDerecha.getPosicionX() - this.esquinaInferiorIzquierda.getPosicionX();
	}
	
	public double calcularArea() {
		return this.alto*this.ancho;
	}

	@Override
	public void mover(double incrementoX, double incrementoY) {
		this.esquinaSuperiorDerecha.mover(incrementoX, incrementoY);
		this.esquinaInferiorIzquierda.mover(incrementoX, incrementoY);
	}
	
}
