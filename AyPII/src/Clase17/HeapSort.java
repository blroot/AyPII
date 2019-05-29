package Clase17;

public final class HeapSort {

	private static <AnyType extends Comparable<? super AnyType>> void downHeap( AnyType [ ] a, int i, int n ) {
		
		int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
  
        // If left child is larger than root 
        if (l < n && a[l].compareTo(a[largest]) > 0) 
            largest = l; 
  
        // If right child is larger than largest so far 
        if (r < n && a[r].compareTo(a[largest]) > 0) 
            largest = r; 
  
        // If largest is not root 
        if (largest != i) 
        { 
            AnyType swap = a[i]; 
            a[i] = a[largest]; 
            a[largest] = swap; 
  
            // Recursively heapify the affected sub-tree 
            downHeap(a, largest, n); 
        } 

	}
	
	public static <AnyType extends Comparable<? super AnyType>> void heapsort( AnyType [ ] a ) {
		
		// Heapify
		for (int i = a.length/2-1; i >= 0; i--) {					
			downHeap(a, i, a.length);
		}
		
		 // One by one extract an element from heap 
        for (int i=a.length-1; i>=0; i--) 
        { 
            // Move current root to end 
            AnyType temp = a[0]; 
            a[0] = a[i];
            a[i] = temp; 
  
            // call max heapify on the reduced heap 
            downHeap(a, 0, i); 
        } 
				
	}

}