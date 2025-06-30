package com.day15;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Graph {
   private Map<Integer, List<Integer>> adjList = new HashMap<>();

   // Add a vertex
   public void addVertex(int v) {
       adjList.putIfAbsent(v, new ArrayList<>());
   }

   // Add an edge (for undirected graph)
   public void addEdge(int src, int dest) {
       adjList.get(src).add(dest);
       adjList.get(dest).add(src);  // Remove this line for directed graph
   }

   // Print the graph
   public void printGraph() {
       for (var entry : adjList.entrySet()) {
           System.out.println("Vertex " + entry.getKey() + " -> " + entry.getValue());
       }
   }
}