package Guia3.ej2;

public class intrumentosDemo {

	public static void main(String[] args) {
		
		Viento[] vientos = new Viento[2];
		vientos[0] = new Flauta();
		vientos[1] = new Trompeta();
		
		Cuerda[] cuerdas = new Cuerda[1];
		cuerdas[0] = new Guitarra();		
		
		Instrumento[] instrumentos = new Instrumento[4];
		
		instrumentos[0] = vientos[0];
		instrumentos[1] = vientos[1];
		instrumentos[2] = new Bateria();
		instrumentos[3] = cuerdas[0];
		
		System.out.println("Lista de instrumentos...");
		
		for (int i = 0; i < instrumentos.length; i++) {
			System.out.println(instrumentos[i].getNombre()
					+ ": " + instrumentos[i].getDescripcion());
		}
		
		System.out.println("Afinando vientos...");
		
		for (int i = 0; i < vientos.length; i++) {
			System.out.println(vientos[i].afinarAutomatico());
		}
		
		System.out.println("Afinando cuerdas...");
		
		for (int i = 0; i < cuerdas.length; i++) {
			System.out.println(cuerdas[i].afinarManual());
		}
		
		for (int i = 0; i < instrumentos.length; i++) {
			System.out.println(instrumentos[i].tocar());
		}
		
	}

}
