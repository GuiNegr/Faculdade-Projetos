public class ExemploGrafo {

    public static void main(String[] args) {

        Graph g = new AdjacencyMatrixGraph(5);
        
        Vertex paulo = new Vertex("Paulo");
        Vertex lorenzo = new Vertex("Lorenzo");
        Vertex kleber = new Vertex("Kleber");
        Vertex claudio = new Vertex("Claudio");
        Vertex cleusa = new Vertex("Cleusa");
        
        g.addEdge(paulo, lorenzo, 2);
        g.addEdge(paulo, cleusa, 1);
        g.addEdge(lorenzo, kleber, 3);
        g.addEdge(kleber, cleusa, 1);
        g.addEdge(claudio, paulo, 3);
        g.addEdge(claudio, lorenzo, 2);
        
        System.out.println("Busca em Largura");
        g.BFS(paulo);
        
        System.out.println("\nBusca em Profundidade");
        g.DFS(paulo);
        
    }
    
}
