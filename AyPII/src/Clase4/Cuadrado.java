package Clase4;
	
public class Cuadrado extends Rectangulo {
	
	Cuadrado(Punto esquina1, Punto esquina2) throws LadoNegativoOCeroNoPermitido {
		super(esquina1, esquina2);
		double alto = Math.abs(esquina2.getPosicionY() - esquina1.getPosicionY());
		double ancho = Math.abs(esquina2.getPosicionX() - esquina1.getPosicionX());
		
		if (ancho != alto) {
			throw new Error("No es un cuadrado");
		}
		
	}
	
	public String toString() {
		return "Cuadrado de area: " + this.calcularArea();
	}

}
