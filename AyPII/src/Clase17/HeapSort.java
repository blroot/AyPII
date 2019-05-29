package Clase17;

public final class HeapSort {

	private static <AnyType extends Comparable<? super AnyType>> void downHeap( AnyType [ ] a, int i, int n ) {
		if (a[i].compareTo(a[n-1]) < 0) {
			AnyType temp = a[i];
			a[i] = a[n-1];
			a[n-1] = temp;
		}
	}
	
	public static <AnyType extends Comparable<? super AnyType>> void heapsort( AnyType [ ] a ) {
		
		int n = a.length;
		
		for (int i = (n-1)/2; i >= 0; i--) {
			
			downHeap(a, i, n);
			n--;
		}
		
	}

}