package Guia3;

import java.util.Comparator;

public class Alumno extends Integrante {
	
	protected int legajo;
	protected double promedioGeneral;
	
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

	public int compareTo(Alumno otro) {
		if (this.promedioGeneral < otro.promedioGeneral) {
			return 1;
		} else if (this.promedioGeneral > otro.promedioGeneral) {
			return -1;
		} else return 0;
	}
	
}
