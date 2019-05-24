package Clase16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BinaryHeapTest {
	
	@Test
	public void testInsertar() {
		BinaryHeap<Integer> bh = new BinaryHeap<Integer>();
		try {
			bh.insert(1);
			bh.insert(3);
			bh.insert(4);
		} catch (BinaryHeapOverflowException e) {
			e.printStackTrace();
		}
		try {
			assertEquals(1, bh.delete());
		} catch (BinaryHeapEmptyException e) {
			e.printStackTrace();
		}
	}

}
