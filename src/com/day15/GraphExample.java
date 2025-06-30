package com.day15;

public class GraphExample {
	 public static void main(String[] args) {
	       Graph g = new Graph();
	       g.addVertex(0);
	       g.addVertex(1);
	       g.addVertex(2);
	       g.addEdge(0, 1);
	       g.addEdge(1, 2);
	       g.addEdge(0, 2);

	       g.printGraph();
	   }

}
