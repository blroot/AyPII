package Clase19;

import java.util.LinkedList;

public class Vertex implements Comparable<Vertex> {
	
	private String name;
	private LinkedList<Edge> adj;
	private int dist;
	private Vertex prev;
	private boolean visited;
	
	Vertex(String name) {
		this.name = name;
		this.adj = new LinkedList<Edge>();
		this.prev = null;
		this.dist = Integer.MAX_VALUE;
		this.visited = false;
	}
	
	public void setPrev(Vertex prev) {
		this.prev = prev;
	}
	
	public void addAdj(Edge adj) {
		this.adj.push(adj);
	}
	
	public void setDist(int dist) {
		this.dist = dist;
	}
	
	public void setVisited() {
		this.visited = true;
	}
	
	public int getDist() {
		return this.dist;
	}
	
	public Vertex getPrev() {
		return this.prev;
	}
	
	public LinkedList<Edge> getAdj() {
		return this.adj;
	}

	@Override
	public int compareTo(Vertex o) {
		if (this.dist > o.getDist()) {
			return 1;
		} else if (this.dist == o.getDist()) {
			return 0;
		} else return -1;
	}

}
