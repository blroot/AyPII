package Clase15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestRobot {
	
	@Test
	public void testRobotMetricoTieneVelocidadCorrecta() {
		Robot robot = new RobotMetrico(100.0, 100.0);
		assertEquals(100.0, robot.getVelocidadEnKmPorHora());
	}
	
	@Test
	public void testRobotMetricoTienePosicionCorrecta() {
		Robot robot = new RobotMetrico(100.0, 100.0);
		assertEquals(100.0, robot.getPosicionEnMetros());
	}
	
	@Test
	public void testRobotMetricoModificacionDeVelocidad() {
		Robot robot = new RobotMetrico(100.0, 100.0);
		robot.setVelocidadEnKmPorHora(250.0);
		assertEquals(250.0, robot.getVelocidadEnKmPorHora());
	}
	
	@Test
	public void testRobotMetricoModificacionDePosicion() {
		Robot robot = new RobotMetrico(100.0, 100.0);
		robot.modificaPosicionEnMetros(23.0);
		assertEquals(23.0, robot.getPosicionEnMetros());
	}

}
