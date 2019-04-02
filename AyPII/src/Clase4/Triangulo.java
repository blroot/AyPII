package Clase4;

public class Triangulo extends Figura {
	
	private Punto a;
	private Punto b;
	private Punto c;
	
	Triangulo(Punto a, Punto b, Punto c) throws ViolacionDeDesigualdadTriangular {
		Punto vec1 = a.menos(b);
		Punto vec2 = a.menos(c);
		Punto vec3 = b.menos(c);
		
		double lado1 = Math.sqrt(Math.pow(vec1.getPosicionX(), 2) + Math.pow(vec1.getPosicionY(), 2));
		double lado2 = Math.sqrt(Math.pow(vec2.getPosicionX(), 2) + Math.pow(vec2.getPosicionY(), 2));
		double lado3 = Math.sqrt(Math.pow(vec3.getPosicionX(), 2) + Math.pow(vec3.getPosicionY(), 2));
		
		if (!(lado1 + lado2 > lado3)) {
			throw new ViolacionDeDesigualdadTriangular("Los puntos no forman un triángulo");
		} else if (!(lado1 + lado3 > lado2)) {
			throw new ViolacionDeDesigualdadTriangular("Los puntos no forman un triángulo");
		} else if (!(lado2 + lado3 > lado1)) {
			throw new ViolacionDeDesigualdadTriangular("Los puntos no forman un triángulo");
		}
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double calcularArea() {
		return (this.a.getPosicionX()*this.b.getPosicionY()-
				this.b.getPosicionX()*this.a.getPosicionY()+
				this.b.getPosicionX()*this.c.getPosicionY()-
				this.c.getPosicionX()*this.b.getPosicionY()+
				this.c.getPosicionX()*this.a.getPosicionY()-
				this.c.getPosicionX()*this.c.getPosicionY())/2;
	}
	
	public String toString() {
		return "Triángulo de area: " + this.calcularArea();
	}

	@Override
	public void mover(double incrementoX, double incrementoY) {
		this.a.mover(incrementoX, incrementoY);
		this.b.mover(incrementoX, incrementoY);
		this.c.mover(incrementoX, incrementoY);
	}

}
