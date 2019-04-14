package Guia6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class clientesDemo {

	public static void main(String[] args) {
		ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
		
		listaDeClientes.add(new Cliente("Roberto", "Les Paul", "35465778", "1134534555"));
		listaDeClientes.add(new Cliente("Fabián", "Les Paul", "35465778", "1134534555"));
		listaDeClientes.add(new Cliente("Carlos", "Fender", "35465778", "1134534555"));
		listaDeClientes.add(new Cliente("Leonardo", "Fender", "35465778", "1134534555"));
		listaDeClientes.add(new Cliente("Roberto", "Epiphone", "35465778", "1134534555"));
		
		Collections.sort(listaDeClientes);
		
		Iterator<Cliente> iterador = listaDeClientes.iterator();
		
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
	}

}
