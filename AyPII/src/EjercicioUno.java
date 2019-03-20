class EjercicioUno {
	public static boolean comprobarTriangulo(int a, int b, int c) {
		return (a + b > c && a + c > b && b + c > a);
	}

	public static double areaEsfera(double radio) {
		if (radio <= 0) {
			throw new Error("El radio debe ser mayor a cero");
		}

		return (4 / 3) * Math.PI * Math.pow(radio, 3);
	}

	public static double distanciaEntreDosPuntos(double a, double b, double c,
			double d) {
		double x1 = a - c;
		double x2 = b - d;

		return Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2));
	}

	public static int sumaDeNumerosPares(int[] arreglo ){
		int suma = 0;
		for (int i = 0 ; i< arreglo.length ; i++) {
			if (arreglo[i]%2 == 0 )  {
				 suma = suma + arreglo[i];
			}
		}
		return suma;
	}
}
