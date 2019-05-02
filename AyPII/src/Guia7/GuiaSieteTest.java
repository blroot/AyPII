package Guia7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.Test;

import Guia6.Queue;

public class GuiaSieteTest {
	
	@Test
	public void sorteoDeJugueteTest() {
		ArrayList<String> listaDeEmpleados = new ArrayList<String>();
		listaDeEmpleados.add("Juan Carlos Ubiquiti");
		listaDeEmpleados.add("José Alcatel");
		listaDeEmpleados.add("Carlos Morgan");
		listaDeEmpleados.add("Roberto Planta");
		
		System.out.println(GuiaSiete.sortearJuguete(listaDeEmpleados));
	}
	
	@Test
	public void listarNombresPosibles() {
		TreeSet<String> conjuntoDeNombres = new TreeSet<String>();
		conjuntoDeNombres.add("Juan Carlos");
		conjuntoDeNombres.add("José");
		conjuntoDeNombres.add("Carlos");
		conjuntoDeNombres.add("Roberto");
		
		GuiaSiete.listarNombresPosibles(conjuntoDeNombres);
	}
	
	@Test
	public void asignarEntradaTest() {
		Queue<String> colaDeEmpleados = new Queue<String>();
		colaDeEmpleados.enqueue("Juan Carlos");
		colaDeEmpleados.enqueue("José");
		colaDeEmpleados.enqueue("Carlos");
		colaDeEmpleados.enqueue("Roberto");
		
		assertEquals("Juan Carlos", GuiaSiete.asignarEntrada(colaDeEmpleados));
		assertEquals("José", GuiaSiete.asignarEntrada(colaDeEmpleados));
		assertEquals("Carlos", GuiaSiete.asignarEntrada(colaDeEmpleados));
		assertEquals("Roberto", GuiaSiete.asignarEntrada(colaDeEmpleados));
	}

}
