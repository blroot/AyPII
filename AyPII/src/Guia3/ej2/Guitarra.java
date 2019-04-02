package Guia3.ej2;

public class Guitarra extends Cuerda {
	
	public static final String nombre = "Guitarra";
	public static final String descripcion = "Instrumento de seis cuerdas";

	@Override
	public String tocar() {
		return "Tocando Guitarra";
	}

	@Override
	public String afinarManual() {
		return "Afinando Guitarra";
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
