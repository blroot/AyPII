package Clase3;

import java.util.Arrays;

public class FigurasDemo {

	public static void main(String[] args) {
		Figura[] figuras = new Figura[10];
		
		figuras[0] = new Rectangulo(new Punto(1.0, 1.0), new Punto(2.0, 2.0));
		figuras[1] = new Elipse(1.0, 2.0, new Punto(1.0, 1.0));
		figuras[2] = new Rectangulo(new Punto(5.0, 3.0), new Punto(7.0, 10.0));
		figuras[3] = new Elipse(2.0, 2.0, new Punto(0.0, 0.0));
		figuras[4] = new Rectangulo(new Punto(1.0, 1.0), new Punto(5.0, 2.0));
		figuras[5] = new Rectangulo(new Punto(1.0, 1.0), new Punto(7.0, 2.0));
		figuras[6] = new Elipse(3.0, 2.0, new Punto(1.0, 1.0));
		figuras[7] = new Rectangulo(new Punto(1.0, 1.0), new Punto(2.0, 2.0));
		figuras[8] = new Elipse(4.0, 2.0, new Punto(1.0, 1.0));
		figuras[9] = new Elipse(5.0, 2.0, new Punto(1.0, 1.0));
				
		Arrays.sort(figuras);
		
		for (int i = 0; i < figuras.length; i++) {
			System.out.println(figuras[i].calcularArea());
		}
	}

}
