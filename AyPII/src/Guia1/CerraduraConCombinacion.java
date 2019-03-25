package Guia1;

public class CerraduraConCombinacion {
	
	private int primerValor;
	private int segundoValor;
	private int tercerValor;
	private boolean estaCerrada;
	
	public CerraduraConCombinacion(int primerValor, int segundoValor, int tercerValor) {
		this.primerValor = primerValor;
		this.segundoValor = segundoValor;
		this.tercerValor = tercerValor;
		this.estaCerrada = true;
	}
	
	public void cerrar() {
		this.estaCerrada = true;
	}
	
	public void abrir(int primerValor, int segundoValor, int tercerValor) {
		if (this.primerValor == primerValor 
				&& this.segundoValor == segundoValor
				&& this.tercerValor == tercerValor) {
			this.estaCerrada = false;
		}
	}
	
	public void cambiarCombinacion(int primerValor, int segundoValor, int tercerValor, 
								   int primerValorNuevo, int segundoValorNuevo, int tercerValorNuevo) {
		if (this.primerValor == primerValor 
				&& this.segundoValor == segundoValor
				&& this.tercerValor == tercerValor) {
			this.primerValor = primerValorNuevo;
			this.segundoValor = segundoValorNuevo;
			this.tercerValor = tercerValorNuevo;
		}
	}
	
	public boolean estaCerrada() {
		return this.estaCerrada;
	}

}
