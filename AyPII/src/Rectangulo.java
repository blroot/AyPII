class Rectangulo {
	private int x;
	private int y;
	private int base;
	private int altura;

	public Rectangulo(int x, int y, int base, int altura) {
		this.x = x;
		this.y = y;
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(int base, int altura) {
		this.x = 0;
		this.y = 0;
		this.base = base;
		this.altura = altura;
	}

	public int area() {
		return base * altura;
	}
	
	public void transladarPlano(int x , int y){
		this.x = this.x + x;
		this.y = this.y + y;
	}
	public boolean contieneA(int x, int y) {
		boolean xEnRango =  (this.x <= x) && (x <= this.x + this.base);
		boolean yEnRango =  (y >= this.y) && (y <= this.y + this.altura);
				
		return xEnRango && yEnRango;
	}
}
