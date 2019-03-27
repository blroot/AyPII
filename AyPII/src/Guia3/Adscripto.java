package Guia3;

public class Adscripto extends Alumno implements Remunerado {
	
	private double sueldoBasico;
	private int cantidadDeMaterias;
	
	Adscripto(String nombre, String apellido, String dni, String direccion, String telefono, 
			   int fechaDeNacimientoDia, int fechaDenacimientoMes, int fechaDeNacimientoAnio,
			   int legajo, double promedioGeneral, double sueldoBasico, int cantidadDeMaterias) {
		
		super(nombre, apellido, dni, direccion, telefono, fechaDeNacimientoDia, fechaDenacimientoMes, 
				fechaDeNacimientoAnio, legajo, promedioGeneral);
		
		if (cantidadDeMaterias > 3) {
			throw new Error("No puede tener mas de 3 materias");
		}
			
		this.sueldoBasico = sueldoBasico;
		this.cantidadDeMaterias = cantidadDeMaterias;
	}
	
	public String toString() {
		return super.toString() + " Sueldo Bruto: " + this.calcularSueldo();
	}

	@Override
	public double calcularSueldo() {
		return this.sueldoBasico*this.cantidadDeMaterias;
	}

	@Override
	public int compareTo(Remunerado otro) {
		if (this.calcularSueldo() > otro.calcularSueldo()) {
			return -1;
		} else if (this.calcularSueldo() < otro.calcularSueldo()) {
			return 1;
		} else return 0;
	}

}
