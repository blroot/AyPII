package Guia6;

public class Cliente implements Comparable<Cliente> {
	
	private String nombre;
	private String apellido;
	private String dni;
	private String telefono;
	
	Cliente(String nombre, String apellido, String dni, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
	}
	
	public String toString() {
		return this.apellido + " " + this.nombre + " " + this.telefono;
	}
	
	public int compareTo(Cliente otro) {
		return (this.apellido+this.nombre).compareTo(otro.apellido+otro.nombre);
	}

}
