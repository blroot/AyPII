package Clase16;

public class BinaryHeap <T extends Comparable<? super T>> {
	
	private static final int DEFAULT_CAPACITY = 100;
	protected boolean max; //true si es heap de máximo
	protected T[] data;
	protected int size;

	public BinaryHeap(int capacity, boolean type) {
		max = type;
		data = (T[]) new Comparable[capacity];
		size = 0;
	}
	public BinaryHeap() {
		this(DEFAULT_CAPACITY, false);
	}
	
	public BinaryHeap(boolean type) {
		this(DEFAULT_CAPACITY, type);
	}
	
	public BinaryHeap(int capacity) {
		this(capacity, false);
	}

	// **********************PRIVATE OPERATIONS**************************
	private void swap (int x, int y) {

		T aux   = data[x];
		data[x] = data[y];
		data[y] = aux;
	}

	private int compare(T x, T y) {

		if (max) 
			return x.compareTo(y);
		else
			return y.compareTo(x);
	}

	private void upHeap(int pos) {
		if (pos == 0) return;
		
		int posPadre = (pos-1)/2;
		
		T x = data[pos];
		T y = data[posPadre];
		
		if (x.compareTo(y) < 0) {
			this.swap(pos, posPadre);
		} else {
			return;
		}
		upHeap(posPadre);
	}
	private void downHeap(int pos) {
		if (pos >= this.size) {
			return;
		}
		int hi = pos * 2 + 1;
		int hd = pos * 2 + 2;
		
		int hm = 0;
		
		if (hi >= this.size && hd >= this.size) {
			return;
		}
		
		if (hd >= this.size) {
			hm = hi;
		}
		
		
	}

	// **********************PUBLIC OPERATIONS**************************

	public void makeEmpty() {
		this.size = 0;
		//this.data = 
	}
	public boolean isFull() {
		return this.data.length == this.size;
	}
	public boolean isEmpty() {
		return this.size == 0;
	}
	public void insert (T x) throws BinaryHeapOverflowException {
		if (this.isFull()) throw new BinaryHeapOverflowException();
		int pos = size++;
		this.data[pos] = x;
		this.upHeap(pos);
	}
	//public T find() throws BinaryHeapEmptyException {
		
	//}
	public T delete() throws BinaryHeapEmptyException {
		T top = this.data[0];
		if (!this.isEmpty()) {
			this.data[0] = this.data[size-1];
			this.downHeap(0);
			this.size--;
		} else {
			throw new BinaryHeapEmptyException();
		}
		return top;
	}

	
}