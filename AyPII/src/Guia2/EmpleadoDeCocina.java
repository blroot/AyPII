package Guia2;

public class EmpleadoDeCocina {
	
	private final String dni;
	private final int diaDeIngreso;
	private final int mesDeIngreso;
	private final int anioDeIngreso;
	private int antiguedad;
	
	EmpleadoDeCocina(String dni, int diaDeIngreso, int mesDeIngreso, int anioDeIngreso, int antiguedad) {
		
		if (dni.length() == 0) {
			throw new Error("El DNI no puede estar vacío");
		}
		
		if (antiguedad < 0) {
			throw new Error("Antiguedad debe ser => 0");
		}
		
		this.dni = dni;
		this.diaDeIngreso = diaDeIngreso;
		this.mesDeIngreso = mesDeIngreso;
		this.anioDeIngreso = anioDeIngreso;
		this.antiguedad = antiguedad;
	}

}
