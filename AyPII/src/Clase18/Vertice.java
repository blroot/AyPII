package Clase18;

import java.util.ArrayList;

public class Vertice {
	
	private String nombre;
	private ArrayList<Arista> adyacencias;
	private int gradoDeEntrada;
	
	Vertice(String nombre, int gradoDeEntrada) {
		this.nombre = nombre;
		this.adyacencias = new ArrayList<Arista>();
		this.gradoDeEntrada = gradoDeEntrada;
	}
	
}
