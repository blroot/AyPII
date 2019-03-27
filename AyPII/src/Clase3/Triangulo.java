package Clase3;

public class Triangulo extends Figura {
	
	private Punto a;
	private Punto b;
	private Punto c;
	
	Triangulo(Punto a, Punto b, Punto c) {
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

	@Override
	public void mover(double incrementoX, double incrementoY) {
		this.a.mover(incrementoX, incrementoY);
		this.b.mover(incrementoX, incrementoY);
		this.c.mover(incrementoX, incrementoY);
	}

}
