import java.util.Arrays;

public class Pilha<T> { // deixo a pilha para pode receber elementos genericos
    public T[] pilha; // criando um vetor de valores genericos
    public int qtditems; // criando um valor para entender se está cheio nossa pilha

    public T[] getPilha() {
        return pilha;
    }

    public void setPilha(T[] pilha) {
        this.pilha = pilha;
    }

    public int getQtditems() {
        return qtditems;
    }

    public void setQtditems(int qtditems) {
        this.qtditems = qtditems;
    }

    public Pilha() {
        this.pilha =(T[]) new Object[1];
        this.qtditems = 0;
    }

    public void adiciona(T elemento){
        if(pilha.length == qtditems){
            aumentacap();
        }
        if(qtditems > 0) {
            for (int i = qtditems - 1; i >= 0; i--) {
                pilha[i + 1] = pilha[i];
            }
            pilha[0] = elemento;
            qtditems++;
        }
        else {
            pilha[0] = elemento;
            qtditems++;
        }
    }
    public void aumentacap(){
        if(qtditems == pilha.length){
            T[] nova =(T[]) new Object[this.pilha.length + 1];
            // aqui para criar novamente o array preciso castar um objeto, (classe mae de todos as classes) para ficar com o valor generico
            //aparatentemente é gambiarra kkk mas preciso mais de estudo para falar se é ou nao
            for (int i = 0; i < pilha.length; i++) {
                nova[i] = this.pilha[i];
            }
            this.pilha = nova;
        }
    }
    public void remover() throws IllegalAccessError{
        if (qtditems == 0){
            throw new IllegalAccessError("Não há elementos para remover na pilha.");
        }

    }

    @Override
    public String toString() {
        return "Pilha{" +
                "pilha=" + Arrays.toString(pilha) +
                '}';
    }
    public Boolean tavazia(){
        if(qtditems == 0){
            return true;
        }
        return false;
    }
}
