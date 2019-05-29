package Clase10;

import org.junit.Test;

import junit.framework.Assert;

public class ArrayQueueTest {
	
	@Test
	public void testColaVacia() {
		ArrayQueue<Integer> cola = new ArrayQueue<Integer>(3);
		Assert.assertTrue(cola.isEmpty());
	}
	
	@Test
	public void testEncolarYDesencolarUno() {
		ArrayQueue<Integer> cola = new ArrayQueue<Integer>(3);
		cola.enqueue(1);
		
		Assert.assertEquals((Integer) 1, cola.dequeue());
	}
	
	@Test
	public void testEncolarYDesencolarTres() {
		ArrayQueue<Integer> cola = new ArrayQueue<Integer>(3);
		cola.enqueue(1);
		cola.enqueue(2);
		cola.enqueue(3);
		
		Assert.assertEquals((Integer) 1, cola.dequeue());
		Assert.assertEquals((Integer) 2, cola.dequeue());
		Assert.assertEquals((Integer) 3, cola.dequeue());
	}
	
	@Test
	public void testEncoloDosCincoVecesDesencoloDosYEncoloTres() {
		ArrayQueue<Integer> cola = new ArrayQueue<Integer>(5);
		System.out.println("asdasd");
		cola.enqueue(2);
		cola.enqueue(2);
		cola.enqueue(2);
		cola.enqueue(2);
		cola.enqueue(2);
		
		cola.dequeue();
		cola.enqueue(3);

		Assert.assertEquals((Integer) 2, cola.dequeue());
	}
}
