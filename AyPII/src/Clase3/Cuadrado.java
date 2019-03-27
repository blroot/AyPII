package Clase3;
	
public class Cuadrado extends Rectangulo {
	
	Cuadrado(Punto esquinaInferiorIzquierda, Punto esquinaSuperiorDerecha) {
		super(esquinaInferiorIzquierda, esquinaSuperiorDerecha);
		double alto = esquinaSuperiorDerecha.getPosicionY() - esquinaInferiorIzquierda.getPosicionY();
		double ancho = esquinaSuperiorDerecha.getPosicionX() - esquinaInferiorIzquierda.getPosicionX();
		
		if (ancho != alto) {
			throw new Error("No es un cuadrado");
		}
		
	}

}
