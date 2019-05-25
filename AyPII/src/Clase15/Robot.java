package Clase15;

// Patron Adapter

public interface Robot {
	
	public double getVelocidadEnKmPorHora();
	public double getPosicionEnMetros();
	public void setVelocidadEnKmPorHora(double velocidad);
	public void modificaPosicionEnMetros(double posicion);

}
