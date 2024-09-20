package GRAPHS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Graph {
    private ArrayList<ArrayList<Integer>> adjList; // Adjacency list using ArrayList

    // Constructor to initialize the adjacency list
    public Graph(int numberOfVertices) {
        adjList = new ArrayList<>(numberOfVertices);
        for (int i = 0; i < numberOfVertices; i++) {
            adjList.add(new ArrayList<>()); // Initialize an empty list for each vertex
        }
    }

    // Method to add an edge between two vertices
    public void addEdge(int u, int v) {
        adjList.get(u).add(v); // Add v to u's list of neighbors
        adjList.get(v).add(u); // Add u to v's list of neighbors (for an undirected graph)
    }

    // BFS implementation
    public void BFS(int start) {
        Set<Integer> visited = new HashSet(); // Array to track visited nodes
        Stack<Integer> queue = new Stack<>();
//        Queue<Integer> queue = new LinkedList<>();

        visited.add(start); // Mark the start node as visited
        queue.add(start); // Enqueue the start node

        while (!queue.isEmpty()) {
            int node = queue.pop(); // Dequeue the current node
            System.out.print(node + " ");

            // Get all adjacent vertices of the dequeued node
            for (int adj : adjList.get(node)) {
                if (!visited.contains(adj)) {
                    visited.add(adj); // Mark the adjacent node as visited
                    queue.add(adj); // Enqueue the adjacent node
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        

        System.out.println("BFS starting from node :");
        graph.BFS(3);
    }
}
