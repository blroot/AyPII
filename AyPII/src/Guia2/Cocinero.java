package Guia2;

public class Cocinero extends EmpleadoDeCocina {

	Cocinero(String dni, int diaDeIngreso, int mesDeIngreso, int anioDeIngreso, int antiguedad) {
		super(dni, diaDeIngreso, mesDeIngreso, anioDeIngreso, antiguedad);
	}
	
	public String armarPlato() {
		return "Plato armado";
	}
	
	public String cocinar() {
		return "Pieza cocida";
	}
	
}
