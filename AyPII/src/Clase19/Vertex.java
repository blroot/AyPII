package Clase19;

import java.util.LinkedList;

public class Vertex {
	
	private String name;
	private LinkedList<Edge> adj;
	private int dist;
	private Vertex prev;
	
	Vertex(String name) {
		this.name = name;
		this.adj = new LinkedList<Edge>();
		this.prev = null;
		this.dist = Integer.MAX_VALUE;
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
	
	public int getDist() {
		return this.dist;
	}
	
	public int getPrevDist() {
		if (this.prev == null) {
			return 0;
		} else return this.prev.getDist();
	}
	
	public Vertex getPrev() {
		return this.prev;
	}
	
	public LinkedList<Edge> getAdj() {
		return this.adj;
	}

}
