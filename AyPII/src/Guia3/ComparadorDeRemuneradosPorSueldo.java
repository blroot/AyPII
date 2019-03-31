package Guia3;

import java.util.Comparator;

public class ComparadorDeRemuneradosPorSueldo implements Comparator<Remunerado> {
	
	private boolean ascendente;
	
	public ComparadorDeRemuneradosPorSueldo(boolean ascendente) {
		this.ascendente = ascendente;
	}

	@Override
	public int compare(Remunerado o1, Remunerado o2) {
		int delta;
		if (o1.calcularSueldo() < o2.calcularSueldo()) {
			delta = 1;
		} else if (o1.calcularSueldo() > o2.calcularSueldo()) {
			delta = -1;
		} else delta = 0;
		
		if (this.ascendente) {
			return delta*-1;
		} else return delta;
	}
	
}
