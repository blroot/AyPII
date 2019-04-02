package Guia3.ej2;

public class Trompeta extends Metal {
	
	public static final String nombre = "Trompeta";
	public static final String descripcion = "Lo que tocaba Miles Davis";

	@Override
	public String afinarAutomatico() {
		return "Afinando Trompeta";
	}

	@Override
	public String tocar() {
		return "Tocando Trompeta";
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
