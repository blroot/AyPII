package Clase19;

import org.junit.Assert;
import org.junit.Test;

public class DijkstraTests {
	
	@Test
	public void unTest() {
		Graph newGraph = new Graph();
		
		newGraph.addEdge("A", "B", 4);
		newGraph.addEdge("A", "C", 1);
		newGraph.addEdge("C", "D", 2);
		newGraph.addEdge("C", "B", 2);
		newGraph.addEdge("B", "E", 3);
		newGraph.addEdge("D", "E", 3);
		
		newGraph.dijkstra("A");
		Assert.assertEquals(0, newGraph.getVertex("A").getDist());
		Assert.assertEquals(3, newGraph.getVertex("B").getDist());
		Assert.assertEquals(1, newGraph.getVertex("C").getDist());
		Assert.assertEquals(3, newGraph.getVertex("D").getDist());
		Assert.assertEquals(6, newGraph.getVertex("E").getDist());
	}

}
