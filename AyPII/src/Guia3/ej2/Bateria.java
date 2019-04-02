package Guia3.ej2;

public class Bateria extends Percusion {
	
	public static final String nombre = "Batería";
	public static final String descripcion = "Instrumento rítmico";

	@Override
	public String tocar() {
		return "Tocando Bateria";
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}
		
}
