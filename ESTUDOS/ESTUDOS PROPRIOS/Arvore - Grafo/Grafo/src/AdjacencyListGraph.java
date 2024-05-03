
import java.util.*;

public class AdjacencyListGraph implements Graph {
    private Map<Vertex, List<Edge>> adjacencyList;

    public AdjacencyListGraph() {
        this.adjacencyList = new HashMap<>();
    }

    @Override
    public void addEdge(Vertex source, Vertex destination, int weight) {
        this.adjacencyList.putIfAbsent(source, new ArrayList<>());
        this.adjacencyList.get(source).add(new Edge(destination, weight));
    }

    @Override
    public void BFS(Vertex startVertex) {
        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        queue.add(startVertex);
        visited.add(startVertex);

        while (!queue.isEmpty()) {
            Vertex vertex = queue.poll();
            System.out.print(vertex + " ");

            for (Edge edge : adjacencyList.get(vertex)) {
                if (!visited.contains(edge.destination)) {
                    visited.add(edge.destination);
                    queue.add(edge.destination);
                }
            }
        }
    }

    @Override
    public void DFS(Vertex startVertex) {
        Set<Vertex> visited = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        stack.push(startVertex);
        while (!stack.isEmpty()) {
            Vertex vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                System.out.print(vertex + " ");
                adjacencyList.get(vertex).forEach(edge -> stack.push(edge.destination));
            }
        }
    }

    private class Edge {
        Vertex destination;
        int weight;

        public Edge(Vertex destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }
}

