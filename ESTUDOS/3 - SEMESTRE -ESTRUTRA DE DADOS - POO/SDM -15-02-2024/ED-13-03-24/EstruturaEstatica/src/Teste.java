public class Teste {
    public static void main(String[] args) throws Exception{
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha);
        System.out.println(pilha.topo());
        System.out.println(pilha.estaVazia());
        for(int i = 0; i <= 70;i = i + 9){
            pilha.empilha(i);
        }
        System.out.println(pilha);
        System.out.println(pilha.estaVazia());

        System.out.println("Tamanho da pilha: "+pilha.tamanho());

        System.out.println(pilha.topo());
        System.out.println("Desempilhar elemento "+pilha.desempilha());
        System.out.println(pilha);

    }
}
