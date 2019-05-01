package Clase11;

public class LinkedList<T> {
	
	private ListNode<T> header;
	private int size;
	
	public LinkedList() {
		this.header = new ListNode<T>();
		this.size = 0;
	}
	/**
	* Verifica si la lista está vacía.
	*
	* @return true si está vacía, false en caso contrario.
	*/
	public boolean isEmpty() {
		return this.header.next == null;
	}
	
	/**
	* Elimina (lógicamente) todos los elementos de la lista.
	*/
	public void makeEmpty() { 
		this.header.next = null;
	}
	/**
	* @return un iterador apuntando al nodo header.
	*/
	public LinkedListIterator<T> zeroth() {
		return new LinkedListIterator<T>(this.header);
	}
	/**
	* @return un iterador posicionado en el primer elemento de la lista.
	*
	Si la lista está vacía devuelve null.
	*/
	public LinkedListIterator<T> first() { 
		if (this.header.next == null) {
			return null;
		}
		return new LinkedListIterator<T>(this.header.next); 
	}
	
	/**
	* Devuelve un iterador apuntando al primer nodo que contiene x.
	*
	* @param x el ítem buscado.
	* @return un iterador; el iterador no es válido si no encuentra x.
	*/
	public LinkedListIterator<T> find(T x) {
		LinkedListIterator<T> iterador = this.first();
		if (iterador != null) {
	 		boolean encontrado = false;
			while (iterador.isValid() && !encontrado) {
				encontrado = iterador.retrieve().equals(x);
				if (!encontrado) {
					iterador.advance();
				}
			}
			if (encontrado) {
				return iterador;
			}
		}
		return new LinkedListIterator<T>(null);
	}
	/**
	* Devuelve un iterador posicionado en el elemento anterior a x.
	*
	* @param x el ítem buscado
	* @return si encuentra x devuelve el iterador. Si no encuentra x,
	*
	devuelve un iterador posicionado en el último elemento de
	*
	la lista.
	*/
	public LinkedListIterator<T> findPrevious(T x) {
		LinkedListIterator<T> iterador = this.zeroth();

 		boolean encontrado = false;
		while (iterador.isValid() && !encontrado && iterador.getActual().next != null) {
			encontrado = iterador.getActual().next.value().equals(x);
			if (!encontrado) {
				iterador.advance();
			}
		}
		return iterador;
	}
	
	/**
	* Inserta x a continuación del nodo apuntado por el iterador p
	*
	* @param x el elemento a insertar
	* @param p posición después de la cual se insertará x.
	*/
	public void insert(T x, LinkedListIterator<T> p) {
		ListNode<T> nuevoNodo = new ListNode<T>(x, p.getActual().next);
		p.getActual().next = nuevoNodo;
		this.size++;
	}
	/**
	* Elimina la primera ocurrencia de x en la lista.
	*
	* @param x el ítem a remover.
	*/
	public void remove(T x) {
		LinkedListIterator<T> iterator = this.findPrevious(x);
		if (iterator.getActual().next == null) {
			iterator.getActual().next = null;
		} else {
			iterator.getActual().next = iterator.getActual().next.next;
		}
		this.size--;
	}
	
	public static void printList(LinkedList<Integer> lista) {
		LinkedListIterator<Integer> iterador = lista.first();
		if (iterador != null) {
			while (iterador.isValid()) {
				System.out.println(iterador.getActual().value());
				iterador.advance();
			}
		}
	}
	
	public static int listSize(LinkedList<Integer> lista) {
		return lista.size;
	}
}