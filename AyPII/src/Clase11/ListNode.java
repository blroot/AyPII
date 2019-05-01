package Clase11;

class ListNode<T> {
	
	protected T element;
	protected ListNode<T> next;

	public ListNode() { 
		this.element = null;
		this.next = null;
	}
	
	public ListNode(T elemento) { 
		this.element = elemento;
		this.next = null;
	}
	
	public ListNode(T elemento, ListNode<T> proximo) { 
		this.element = elemento;
		this.next = proximo;
	}
	
	public T value() {
		return this.element;
	}

}
