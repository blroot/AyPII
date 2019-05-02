package Clase12;

public class BinaryTreeDemo {

	public static void main(String[] args) {
		
		BinarySearchTree<Integer> arbolBinario = new BinarySearchTree<Integer>();
		
		arbolBinario.insert(20);
		arbolBinario.insert(15);
		arbolBinario.insert(40);
		arbolBinario.insert(10);
		arbolBinario.insert(16);
		arbolBinario.insert(5);
		arbolBinario.insert(6);
		arbolBinario.insert(35);
		arbolBinario.insert(60);
		
		if (arbolBinario.findMin() != 5) {
			System.out.println("Mínimo incorrecto");
		}
		
		if (arbolBinario.findMax() != 60) {
			System.out.println("Máximo incorrecto");
		}
		
		if (arbolBinario.find(5) == 5) {
			System.out.println("5 encontrado");
		}
		
		if (arbolBinario.find(1) == null) {
			System.out.println("1 no encontrado");
		}
		
		arbolBinario.removeMin();
		if (arbolBinario.findMin() != 5) {
			System.out.println("Mínimo fué removido correctamente");
		}
		
		
		

	}

}
