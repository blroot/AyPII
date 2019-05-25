package Clase15;

public class RobotImperial {
	
	private double velocidadEnMillasPorHora;
	private double posicionEnPies;
	
	public RobotImperial(double velocidad, double posicion) {
		this.velocidadEnMillasPorHora = velocidad;
		this.posicionEnPies = posicion;
	}
	
	public void setVelocidadEnMillasPorHora(double velocidad) {
		this.velocidadEnMillasPorHora = velocidad;
	}
	
	public void modificaPosicionEnMillas(double posicion) {
		this.posicionEnPies = posicion;
	}
	
	public double getVelocidadEnMillasPorHora() {
		return this.velocidadEnMillasPorHora;
	}
	
	public double getPosicionEnPies() {
		return this.posicionEnPies;
	}

}
