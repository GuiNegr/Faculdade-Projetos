import java.util.*;

public class AdjacencyMatrixGraph implements Graph {
    private int[][] adjacencyMatrix;
    private List<Vertex> vertices;

    public AdjacencyMatrixGraph(int numberOfVertices) {
        this.adjacencyMatrix = new int[numberOfVertices][numberOfVertices];
        this.vertices = new ArrayList<>(numberOfVertices);
    }

    @Override
    public void addEdge(Vertex source, Vertex destination, int weight) {
        if (!vertices.contains(source)) {
            vertices.add(source);
        }
        if (!vertices.contains(destination)) {
            vertices.add(destination);
        }
        int sourceIndex = vertices.indexOf(source);
        int destIndex = vertices.indexOf(destination);
        adjacencyMatrix[sourceIndex][destIndex] = weight;
    }

    @Override
    public void BFS(Vertex startVertex) {
        int startIndex = vertices.indexOf(startVertex);
        boolean[] visited = new boolean[vertices.size()];
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(n -> n.weight));

        queue.add(new Node(startIndex, 0));
        visited[startIndex] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int currentIndex = node.index;
            Vertex currentVertex = vertices.get(currentIndex);
            System.out.print(currentVertex + " ");

            for (int i = 0; i < vertices.size(); i++) {
                if (adjacencyMatrix[currentIndex][i] > 0 && !visited[i]) {
                    visited[i] = true;
                    queue.add(new Node(i, adjacencyMatrix[currentIndex][i]));
                }
            }
        }
    }

    @Override
    public void DFS(Vertex startVertex) {
        int startIndex = vertices.indexOf(startVertex);
        boolean[] visited = new boolean[vertices.size()];
        PriorityQueue<Node> stack = new PriorityQueue<>(Comparator.comparingInt(n -> n.weight));

        stack.add(new Node(startIndex, 0));

        while (!stack.isEmpty()) {
            Node node = stack.poll();
            int currentIndex = node.index;
            if (!visited[currentIndex]) {
                visited[currentIndex] = true;
                Vertex currentVertex = vertices.get(currentIndex);
                System.out.print(currentVertex + " ");

                for (int i = vertices.size() - 1; i >= 0; i--) {
                    if (adjacencyMatrix[currentIndex][i] > 0 && !visited[i]) {
                        stack.add(new Node(i, adjacencyMatrix[currentIndex][i]));
                    }
                }
            }
        }
    }

    private class Node {
        int index;
        int weight;

        public Node(int index, int weight) {
            this.index = index;
            this.weight = weight;
        }
    }
}
