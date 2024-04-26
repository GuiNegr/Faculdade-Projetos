public class ListaEcandeada<T> {
    public No head;//primeiro valor da lista
    public No tail;//ultimo valor da lista
    public int size; // para ter o controle de quantos items tem

    public ListaEcandeada() {
        this.head = head;
        this.tail = head;
        size = 0;
    }

    public void add(T elemento){
        No novo = new No<T>(elemento);
        if(head == null){
            head = novo;
            tail = novo;
            size++;
        }else{
            No aux = head;//crio um auxilar para me ajudar a iterar a lista
             while(aux.getProximo() != null){//verifico a lista até encontrar o primeiro valor nulo ou seja vazio
                 aux = aux.getProximo();//forma "acionar o contador +1"
             }
             aux.setProximo(novo); // aux agr provavelente é o ultimo valor adicionado e seta para o novo ser o proximo
             tail = novo;
             size++;
        }
    }
    public void addInicio(T elemento){
        if(head == null){
            No novo = new No<T>(elemento);
            head = novo;
            tail = novo;
            size++;
        }
        else{
            No novo = new No<T>(elemento);// bem simples, faço um novo nó
            novo.setProximo(head); //falo q o proximo dele e a lista todo
            this.head = novo;// faço ele ser o novo head
            size++;
        }
    }
    public void removeinicio(){
        if(head != null){
                head = head.getProximo();
                size--;
        }
    }
    public void removeultimo(){
        No aux = head;
        while(aux.getProximo() != null){
            aux = aux.getProximo();
        }
        No aux2 = head;
        while(aux2.getProximo() != aux){
            aux2 = aux2.getProximo();
        }
        aux2.setProximo(null);
        tail = aux2;
        size--;

    }

    @Override
    public String toString() {
        return "ListaEcandeada{" +
                "head =" + head +
                "\n, tail =" + tail +
                "\n , size =" + size +
                '}';
    }
}
