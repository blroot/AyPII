package Guia7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import Guia6.Queue;


class GuiaSiete {
	
	public static String sortearJuguete(ArrayList<String> listaDeEmpleados) {
		int numeroDeEmpleados = listaDeEmpleados.size();
		Random random = new Random();
		int numeroPseudoAleatorio = random.nextInt(numeroDeEmpleados);
		
		return listaDeEmpleados.get(numeroPseudoAleatorio);
	}
	
	public static void listarNombresPosibles(TreeSet<String> listaDeNombres) {
		for (String nombre : listaDeNombres) {
			System.out.println(nombre);
		}
	}
	
	public static String asignarEntrada(Queue<String> colaDeEspera) {
		if (!colaDeEspera.isEmpty()) {
			return colaDeEspera.dequeue();
		}
		return null;
	}

	

}
