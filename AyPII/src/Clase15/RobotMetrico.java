package Clase15;

// Patron Adapter

public class RobotMetrico implements Robot {
	
	private RobotImperial robotImperial;
	
	public RobotMetrico(double velocidad, double posicion) {
		this.robotImperial = new RobotImperial(velocidad/1.6093, posicion/0.3048);
	}

	@Override
	public double getVelocidadEnKmPorHora() {
		return this.robotImperial.getVelocidadEnMillasPorHora() * 1.6093;
	}

	@Override
	public void setVelocidadEnKmPorHora(double velocidad) {
		this.robotImperial.setVelocidadEnMillasPorHora(velocidad/1.6093);
	}

	@Override
	public void modificaPosicionEnMetros(double posicion) {
		this.robotImperial.modificaPosicionEnMillas(posicion/0.3048);
	}

	@Override
	public double getPosicionEnMetros() {
		return this.robotImperial.getPosicionEnPies() * 0.3048;
	}
	
}
