package Clase10;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue<T> implements QueueInterface<T> {
	
	private T[] queue; // los elementos
	private int size; // cantidad de elementos
	private int first; // índice del primer elemento
	private int last; // índice del próximo lugar disponible

	public ArrayQueue(int max) {
		this.queue = (T[])new Object[max];
		this.size = 0;
		this.first = 0;
		this.last = 0;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public void enqueue(T newItem) {			
		// duplicar tamaño si hace falta
		if (this.size == this.queue.length-1) {
			resize(2 * this.queue.length);
		}
		
		this.size++;
		this.queue[last % this.queue.length] = newItem;
		this.last++;
	}
	
	public T dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue underflow");
		}
		
		this.size--;
		return this.queue[first++ % this.queue.length];
	}
	
	public T peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue underflow");
		}
		
		return this.queue[first];
	}
	
	private void resize(int i) {
		T[] copiaDeArray = Arrays.copyOf(this.queue, i);
		
		
		
		this.queue = copiaDeArray;
	}

}