package Guia2;

public class Lavacopas extends EmpleadoDeCocina {

	Lavacopas(String dni, int diaDeIngreso, int mesDeIngreso, int anioDeIngreso, int antiguedad) {
		super(dni, diaDeIngreso, mesDeIngreso, anioDeIngreso, antiguedad);
	}

	public String lavarCopa() {
		return "Copa lavada";
	}
	
}
