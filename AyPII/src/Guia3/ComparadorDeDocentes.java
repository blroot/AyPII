package Guia3;

import java.util.Comparator;

public class ComparadorDeDocentes implements Comparator<Remunerado> {

	@Override
	public int compare(Remunerado o1, Remunerado o2) {
		if (o1.calcularSueldo() > o2.calcularSueldo()) {
			return -1;
		} else if (o1.calcularSueldo() < o2.calcularSueldo()) {
			return 1;
		} else return 0;
	}
	
}
