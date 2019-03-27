package Guia1;

public class Persona {
	
	private String nombre;
	private int edad;
	
	Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public boolean equals(Persona p) {
		return this == p;
	}
	
}
