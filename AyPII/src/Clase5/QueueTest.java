package Clase5;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {
	
	@Test
	public void colaConTresEnterosTieneTamanioTres() {
		Queue<Integer> cola = new Queue<Integer>();
		cola.enqueue(1);
		cola.enqueue(2);
		cola.enqueue(3);
		Assert.assertEquals(3, cola.size());
	}
	
	@Test
	public void elPrimeroQueEntraPrimeroSale() {
		Queue<Integer> cola = new Queue<Integer>();
		cola.enqueue(1);
		cola.enqueue(2);
		cola.enqueue(3);
		Assert.assertEquals((Integer) 1, cola.dequeue());
	}
	
	@Test
	public void colaVaciaTieneTamanioCero() {
		Queue<Integer> cola = new Queue<Integer>();
		Assert.assertEquals(0, cola.size());
	}
	
	@Test
	public void colaVaciaEstaVacia() {
		Queue<Integer> cola = new Queue<Integer>();
		Assert.assertTrue(cola.isEmpty());
	}
	
	@Test
	public void primerEnteroAgregadoEsUno() {
		Queue<Integer> cola = new Queue<Integer>();
		cola.enqueue(1);
		cola.enqueue(4);
		cola.enqueue(5);
		Assert.assertEquals((Integer) 1, cola.peek());
	}
	
	@Test(expected = NoSuchElementException.class)
	public void siPidoUnElementoNoExistenteArrojaExcepcion() {
		Queue<Integer> cola = new Queue<Integer>();
		cola.enqueue(8);
		cola.dequeue();
		cola.dequeue();
	}
	
	@Test
	public void prueboDesencolarConBucle() {
		Queue<Integer> cola = new Queue<Integer>();

		cola.enqueue(1);
		cola.enqueue(4);
		cola.enqueue(5);
		
		Integer[] arrayDePrueba = {1,4,5};
		int pos = 0;
		
		while(!cola.isEmpty()) {
			Assert.assertEquals(arrayDePrueba[pos], cola.dequeue());
			pos++;
		}
		
	}
 
}
