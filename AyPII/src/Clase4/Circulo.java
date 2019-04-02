package Clase4;

public class Circulo extends Elipse {
	
	Circulo(double radio, Punto centro) throws RadioNegativoOCeroNoPermitido {
		super(radio, radio, centro);
	}

}
