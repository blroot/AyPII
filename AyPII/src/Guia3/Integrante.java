package Guia3;

public class Integrante implements Comparable<Integrante> {
	
	protected String nombre;
	protected String apellido;
	protected String dni;
	protected String direccion;
	protected String telefono;
	protected String nombreCompleto;
	protected int fechaDeNacimientoDia;
	protected int fechaDeNacimientoMes;
	protected int fechaDeNacimientoAnio;
	
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
