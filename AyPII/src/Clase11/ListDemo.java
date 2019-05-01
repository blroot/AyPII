package Clase11;

public class ListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> lista = new LinkedList<Integer>();
		LinkedListIterator<Integer> itr = lista.zeroth();
		LinkedList.printList(lista);
		
		for (int i = 0; i < 10; i++) {
			lista.insert(i, itr);
			LinkedList.printList(lista);
			itr.advance();
		}
		
		System.out.println("Size was: " + LinkedList.listSize(lista));
		
		for (int i = 0; i < 10; i += 2) {
			lista.remove(i);
		}
		
		for (int i = 0; i < 10; i++) {
			if ((i % 2 == 0) == (lista.find(i).isValid())) {
				System.out.println("Find fails!");
			}
		}
		
		System.out.println("Finished deletions");
		LinkedList.printList(lista);
	}
}
