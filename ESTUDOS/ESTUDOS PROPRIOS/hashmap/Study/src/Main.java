public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //conceito para estudos
        System.out.println("Testando metodos da pilha");

        Pilha<String> pilha = new Pilha<>();

        System.out.println("A pilha está vazia? "+pilha.tavazia());

        pilha.adiciona("Joao");
        pilha.adiciona("roberto");
        pilha.adiciona("marcos");
        pilha.adiciona("jose");

        System.out.println(pilha);

        pilha.remover();
        System.out.println("A pilha está vazia? "+pilha.tavazia());
        System.out.println(pilha);
        System.out.println("fim dos metodos da pilha");

        Fila<String> fila = new Fila<>();
        fila.adiciona("marcos");
        fila.adiciona("josue");
        fila.adiciona("roberto");
        System.out.println(fila);
        System.out.println("Removendo o primeiro valor, conceito LIFO");
        fila.remover();
        System.out.println(fila);
    }
}