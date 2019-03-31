package Guia3;

public abstract class Integrante implements Comparable<Integrante> {
	
	private String nombre;
	private String apellido;
	private String dni;
	private String direccion;
	private String telefono;
	private String nombreCompleto;
	private int fechaDeNacimientoDia;
	private int fechaDeNacimientoMes;
	private int fechaDeNacimientoAnio;
	
	public Integrante(String nombre, String apellido, String dni, String direccion, String telefono, 
					  int fechaDeNacimientoDia, int fechaDenacimientoMes, int fechaDeNacimientoAnio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombreCompleto = this.nombre + "," + this.apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fechaDeNacimientoDia = fechaDeNacimientoDia;
		this.fechaDeNacimientoMes = fechaDenacimientoMes;
		this.fechaDeNacimientoAnio = fechaDeNacimientoAnio;
	}
	
	public String toString() {
		return "Nombre completo: " + this.nombreCompleto;
	}

	public int compareTo(Integrante otro) {
		return this.nombreCompleto.compareToIgnoreCase(otro.nombreCompleto);
	}
		
}
