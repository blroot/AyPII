package Guia3;

import java.util.Comparator;

public class ComparadorDeDocentes implements Comparator<Remunerado> {

	@Override
	public int compare(Remunerado o1, Remunerado o2) {
		return o1.compareTo(o2);
	}
	
}
