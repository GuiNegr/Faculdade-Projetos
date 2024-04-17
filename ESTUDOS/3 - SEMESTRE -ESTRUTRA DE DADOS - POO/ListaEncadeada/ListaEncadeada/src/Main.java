public class Main {

    public static void main(String[] args) {
        ListaEncadeada<Object> listaEncadeada = new ListaEncadeada<>();
        System.out.println("Tamanho: " + listaEncadeada.getTamanho());
        listaEncadeada.adicionar("Shrek");
        System.out.println(listaEncadeada);
        System.out.println("Tamanho da lista = " + listaEncadeada.getTamanho());
        System.out.println("Inicio da lista = " + listaEncadeada.getInicio().getElemento());
        System.out.println("Fim da lista = " + listaEncadeada.getFim().getElemento());
        listaEncadeada.adicionar("Burro");
        System.out.println(listaEncadeada);
        System.out.println("Tamanho da lista = " + listaEncadeada.getTamanho());
        System.out.println("Inicio da lista = " + listaEncadeada.getInicio().getElemento());
        System.out.println("Fim da lista = " + listaEncadeada.getFim().getElemento());
        listaEncadeada.adicionar("Lorde Farquaad");
        System.out.println(listaEncadeada);
        System.out.println("Tamanho da lista = " + listaEncadeada.getTamanho());
        System.out.println("Inicio da lista = " + listaEncadeada.getInicio().getElemento());
        System.out.println("Fim da lista = " + listaEncadeada.getFim().getElemento());
    }

}