package Clase19;

public class Edge {
	
	private Vertex dest;
	private int weight;
	
	Edge(Vertex dest) {
		this.dest = dest;
	}
	
	Edge(Vertex dest, int weigth) {
		this.dest = dest;
		this.weight = weigth;
	}
	
	public Vertex getDest() {
		return this.dest;
	}
	
	public int getWeight() {
		return this.weight;
	}

}
