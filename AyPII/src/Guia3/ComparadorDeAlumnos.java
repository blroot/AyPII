package Guia3;

import java.util.Comparator;

public class ComparadorDeAlumnos implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		return o1.compareTo(o2);
	}

}
