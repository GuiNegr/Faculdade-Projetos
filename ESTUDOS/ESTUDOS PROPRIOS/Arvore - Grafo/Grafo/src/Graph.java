
public interface Graph {
    void addEdge(Vertex source, Vertex destination, int weight);
    void BFS(Vertex startVertex);
    void DFS(Vertex startVertex);
}

