public class Main {
    public static void main(String[] args) {
       
        ListaDuplamenteEncadeadaCircular<String> lista = new ListaDuplamenteEncadeadaCircular<>();

        lista.adicionarInicio("A");
        lista.adicionarFim("B");
        lista.adicionarFim("C");
        lista.adicionarInicio("D");


        System.out.println("Lista:");
        lista.imprimir();


        System.out.println("Lista reversa:");
        lista.imprimirReverso();


        System.out.println("Lista vazia? " + lista.estaVazia());


        System.out.println("Tamanho da lista: " + lista.getTamanho());


        System.out.println("Primeiro elemento: " + lista.obterPrimeiro());
        System.out.println("Último elemento: " + lista.obterUltimo());

        System.out.println("A está na lista? " + lista.contem("A"));
        System.out.println("Z está na lista? " + lista.contem("Z"));


        System.out.println("Índice de B: " + lista.obterIndice("B"));


        lista.removerInicio();
        lista.removerFim();


        System.out.println("Lista após remoções:");
        lista.imprimir();


        lista.addIndice(1, "X");


        System.out.println("Lista após adição em uma posição específica:");
        lista.imprimir();

        lista.Removeindice(1);


        System.out.println("Lista após remoção em uma posição específica:");
        lista.imprimir(); // Saída esperada: A


        System.out.println("Elemento na posição 0: " + lista.obterIndice(0));


        lista.limpar();

        System.out.println("Lista após limpeza:");
        lista.imprimir();
    }
}
