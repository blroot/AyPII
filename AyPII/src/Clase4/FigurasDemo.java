package Clase4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FigurasDemo {

	public static void main(String[] args) {

		try {
			FileReader archivo = new FileReader("/home/blroot/git/aypii/AyPII/src/Clase4/escena.txt");
			BufferedReader lector = new BufferedReader(archivo);
			String unaLinea;
			int pos = 0;
			// TODO: Encontrar manera de declarar array con tamaño adecuado
			Figura[] figuras = new Figura[5];
			
			System.out.println("Leyendo archivo de figuras...");
			
			while ((unaLinea = lector.readLine()) != null) {
				
				StringTokenizer st = new StringTokenizer(unaLinea);
				String tipoDeFigura = st.nextToken(": ");
				String DatosDeFigura = st.nextToken(": ");

				construirFigura(figuras, pos, tipoDeFigura, DatosDeFigura);

				pos++;
			}
			archivo.close();
			
			for (int i = 0; i < figuras.length; i++) {
				System.out.println(figuras[i].toString());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("No se econtró el archivo");	
		} catch (IOException e) {
			System.out.println("No se pudo leer la linea" );
		}
		
	}

	private static void construirFigura(Figura[] figuras, int pos, String tipoDeFigura, String datosDeFigura) {
		StringTokenizer st = new StringTokenizer(datosDeFigura);
		int lado1;
		int lado2;
		switch (tipoDeFigura) {
			case "circulo":
				int radio = Integer.parseInt(st.nextToken(","));
				try {
					figuras[pos] = new Circulo(radio, new Punto(0.0, 0.0));
				} catch (RadioNegativoOCeroNoPermitido e) {
					System.out.println("Linea: " + pos + " No se pudo crear un circulo con radio cero o negativo en");
				}
				break;
			case "cuadrado":
				int lado = Integer.parseInt(st.nextToken(","));
				try {
					figuras[pos] = new Cuadrado(new Punto(0.0, 0.0), new Punto(lado, lado));
				} catch (LadoNegativoOCeroNoPermitido e) {
					System.out.println("Linea: " + pos + " No se pudo crear cuadrado con lados cero o negativo");
				}
				break;
			case "rectangulo":
				lado1 = Integer.parseInt(st.nextToken(","));
				lado2 = Integer.parseInt(st.nextToken(","));
				try {
					figuras[pos] = new Rectangulo(new Punto(0.0, 0.0), new Punto(lado1, lado2));
				} catch (LadoNegativoOCeroNoPermitido e) {
					System.out.println("Linea: " + pos + " No se pudo crear rectangulo con lados cero o negativo");
				}
				break;
			case "elipse":
				int radio1 = Integer.parseInt(st.nextToken(","));
				int radio2 = Integer.parseInt(st.nextToken(","));
				try {
					figuras[pos] = new Elipse(radio1, radio2, new Punto(0.0, 0.0));
				} catch (RadioNegativoOCeroNoPermitido e) {
					System.out.println("Linea: " + pos + " No se pudo crear elipse con radio cero o negativo");
				}
				break;
			case "triangulo":
				lado1 = Integer.parseInt(st.nextToken(","));
				lado2 = Integer.parseInt(st.nextToken(","));
				int lado3 = Integer.parseInt(st.nextToken(","));
				try {
					figuras[pos] = new Triangulo(new Punto(lado1, 0.0), new Punto(0.0, lado2), new Punto(lado1, lado2));
				} catch (ViolacionDeDesigualdadTriangular e) {
					System.out.println("Linea: " + pos + " No se pudo crear triángulo con los lados especificados");
				}
				break;
			default:
				break;
			}
	}

}
