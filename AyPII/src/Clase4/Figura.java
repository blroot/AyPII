package Clase4;

public abstract class Figura implements Comparable<Figura>, Movible {
	
	public abstract double calcularArea();
	public abstract String toString();
	public int compareTo(Figura otra) {
		if (this.calcularArea() > otra.calcularArea()) {
			return 1;
		} else if (this.calcularArea() < otra.calcularArea()) {
			return -1;
		} else {
			return 0;
		}
	}
	
}

