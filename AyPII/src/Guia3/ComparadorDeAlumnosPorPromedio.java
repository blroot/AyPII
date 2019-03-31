package Guia3;

import java.util.Comparator;

public class ComparadorDeAlumnosPorPromedio implements Comparator<Alumno> {
	
	private boolean ascendente;
	
	public ComparadorDeAlumnosPorPromedio(boolean ascendente) {
		this.ascendente = ascendente;
	}

	@Override
	public int compare(Alumno o1, Alumno o2) {
		int delta;
		if (o1.getPromedioGeneral() < o2.getPromedioGeneral()) {
			delta = 1;
		} else if (o1.getPromedioGeneral() > o2.getPromedioGeneral()) {
			delta = -1;
		} else delta = 0;
		
		if (this.ascendente) {
			return delta*-1;
		} else return delta;
	}

}
