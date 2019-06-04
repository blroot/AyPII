package Clase19;

import org.junit.Assert;
import org.junit.Test;


public class BreadthFirstSearchTest {
	
	@Test
	public void unTest() {
		Graph newGraph = new Graph();
		newGraph.getVertex("A");
		newGraph.getVertex("B");
		newGraph.getVertex("C");
		newGraph.getVertex("D");
		newGraph.getVertex("E");
		
		newGraph.addEdge("A", "B");
		newGraph.addEdge("A", "C");
		newGraph.addEdge("C", "D");
		newGraph.addEdge("B", "D");
		newGraph.addEdge("D", "E");
		
		newGraph.breadthFirstSearch("A");
		Assert.assertEquals(4, newGraph.getVertex("E").getDist());
		Assert.assertEquals(0, newGraph.getVertex("A").getDist());
		Assert.assertEquals(1, newGraph.getVertex("B").getDist());
		Assert.assertEquals(1, newGraph.getVertex("C").getDist());
		Assert.assertEquals(2, newGraph.getVertex("D").getDist());
	}

}
