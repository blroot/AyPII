package Guia3.ej2;

public class Flauta extends Madera {
	
	public static final String nombre = "Flauta";
	public static final String descripcion = "Instrumento que nadie quiere tocar";
	
	@Override
	public String tocar() {
		return "Tocando Flauta";
	}

	@Override
	public String afinarAutomatico() {
		return "Afinando Flauta";
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
