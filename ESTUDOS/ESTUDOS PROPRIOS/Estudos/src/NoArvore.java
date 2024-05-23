//Estou seguindo o livro "Como Programar em java 6 Edição Deitel"
//criação da classe e obejto No q vai na arvore
// arvore e uma lista encadeada com dois nós, aonde o primeiro nó(nó raiz) agrupa valores menores que ele no sub nó a esquerda e os maiores na direita
//isto é uma forma de melhorar buscabinarias e conseguir um algoritmo de pesquisa e armazenamento muito eficiente.
//no folha sao os no que não possue subarvores nele, são no "Finais"
//a base de inserção/busca e recursividade, o caso base sempre vai ser oque procura. se for valor para inserir, aonde aparece o null.

public class NoArvore {
    //Istoé o que liga os nós de arvore, como uma lista encadeada
    NoArvore leftNode;
    NoArvore rigthNode;
    int value; // Valor do nó

    //criando o construtor do objeto que inicializa os dados e os torna um no folha
    public NoArvore(int valorNo) {
        this.value = valorNo;
        leftNode = null;
        rigthNode = null; //assumimos até então que ambos os valores de link estão vazio no momento que criamos o objeto
    }


    //vai localizar pontos de valores para inserir, e ignorar valores duplicados
    public void insert(int valorinserido) {

        //isere o valor na subarvore a esquerda
        if (valorinserido < value) {
            if (leftNode == null) {
                leftNode = new NoArvore(valorinserido);
            } else {
                leftNode.insert(valorinserido);
            }
        } else if (valorinserido > value) {
            if (rigthNode == null) {
                rigthNode = new NoArvore(valorinserido);
            } else {
                rigthNode.insert(valorinserido);
            }
        }
    }
}
