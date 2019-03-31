package Guia3;

public class Alumno extends Integrante {
	
	private int legajo;
	private double promedioGeneral;
	
	Alumno(String nombre, String apellido, String dni, String direccion, String telefono, 
		   int fechaDeNacimientoDia, int fechaDenacimientoMes, int fechaDeNacimientoAnio,
		   int legajo, double promedioGeneral) {
		
		super(nombre, apellido, dni, direccion, telefono, fechaDeNacimientoDia, fechaDenacimientoMes, 
				fechaDeNacimientoAnio);
		
		this.legajo = legajo;
		this.promedioGeneral = promedioGeneral;
	}
	
	public String toString() {
		return super.toString() + " Promedio general: " + this.promedioGeneral;
	}

	public double getPromedioGeneral() {
		return this.promedioGeneral;
	}
	
}
