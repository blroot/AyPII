package Guia2;

public class AyudanteDeCocina extends EmpleadoDeCocina {
	
	AyudanteDeCocina(String dni, int diaDeIngreso, int mesDeIngreso, int anioDeIngreso, int antiguedad) {
		super(dni, diaDeIngreso, mesDeIngreso, anioDeIngreso, antiguedad);
	}
	
	public String pelarPapa() {
		return "Papa pelada";
	}

}
