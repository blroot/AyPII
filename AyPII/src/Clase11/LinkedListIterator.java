package Clase11;

public class LinkedListIterator<T> {
	
	private ListNode<T> actual;
	
	public LinkedListIterator(ListNode<T> actual) {
		this.actual = actual;
	}
	
	public boolean isValid() {
		return this.actual != null;
	}
	
	public ListNode<T> getActual() {
		return this.actual;
	}
	
	public T retrieve() {
		return isValid() ? this.actual.element : null;
	}
	
	public void advance() {
		if (isValid()) {
			this.actual = this.actual.next;
		}
	}
	
}
