package Guia3;

public class Docente extends Integrante implements Remunerado, Comparable<Integrante>{
	
	private String cuil;
	private int antiguedad;
	private double sueldoBasico;
	
	Docente(String nombre, String apellido, String dni, String direccion, String telefono, 
			int fechaDeNacimientoDia, int fechaDenacimientoMes, int fechaDeNacimientoAnio,
			int antiguedad, double sueldoBasico) {
		
		super(nombre, apellido, dni, direccion, telefono, fechaDeNacimientoDia, fechaDenacimientoMes, 
				fechaDeNacimientoAnio);

		this.antiguedad = antiguedad;
		this.sueldoBasico = sueldoBasico;
	}
	
	public String toString() {
		return super.toString() + " Sueldo Bruto: " + this.calcularSueldo();
	}

	@Override
	public double calcularSueldo() {
		double sueldoBruto = 0.0;
		
		if (this.antiguedad <= 10) {
			sueldoBruto = this.sueldoBasico + this.sueldoBasico*0.10;
		} else if (this.antiguedad >= 11 && this.antiguedad <= 15) {
			sueldoBruto = this.sueldoBasico + this.sueldoBasico*0.15;
		} else if (this.antiguedad >= 16 && this.antiguedad <= 20) {
			sueldoBruto = this.sueldoBasico + this.sueldoBasico*0.20;
		} else {
			sueldoBruto = this.sueldoBasico + this.sueldoBasico*0.25;
		}
		
		return sueldoBruto;
	}

}
