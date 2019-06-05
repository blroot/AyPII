package Clase19;

import java.util.HashMap;
import Clase5.Queue;

public class Graph {
	
	private HashMap<String, Vertex> vertexMap;
	
	Graph() {
		this.vertexMap = new HashMap<String, Vertex>();
	}
	
	public void addEdge(String source, String dest) {
		// Consulto el vertice origen
		Vertex sourceVertex = this.getVertex(source);
		// Consulto el vertice destino
		Vertex destVertex = this.getVertex(dest);
		// Construyo una nueva arista con vertice destino
		Edge newEdge = new Edge(destVertex);
		
		sourceVertex.addAdj(newEdge);
		destVertex.setPrev(sourceVertex);
		
	}
	
	public Vertex getVertex(String name) {
		if (this.vertexMap.containsKey(name)) {
			return this.vertexMap.get(name);
		} else {
			Vertex newVertex = new Vertex(name);
			this.vertexMap.put(name, newVertex);
			return newVertex;
		}
	}
	
	public void breadthFirstSearch(String start) {
		Queue<Vertex> q = new Queue<Vertex>();
		Vertex startVertex = this.getVertex(start);
		startVertex.setDist(0);
		
		// Encolo
		q.enqueue(startVertex);
		
		while(!q.isEmpty()) { 
			Vertex v = q.dequeue();
			for (Edge edge: v.getAdj()) {
				if (edge.getDest().getDist() == Integer.MAX_VALUE) {
					edge.getDest().setDist(v.getDist() + 1);
					q.enqueue(edge.getDest());
				}
			}
		}
	}

}
