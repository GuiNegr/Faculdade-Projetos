//aqui que inicializarmos a lista

public class RaizNo {
    private NoArvore raiz;


    // inicializa nulla
    public RaizNo(){
        raiz = null;
    }


    public void insertNo(int valorinserido){
        if(raiz == null){
            raiz = new NoArvore(valorinserido);
        }
        else {
            raiz.insert(valorinserido);
        }
    }


    //metodos a seguir são para poder vizualizar a arvore, note que todos eles funciona a base de recursão
    public void preoderTraversal(){
        preoderHelp(raiz);
    }
    private void preoderHelp(NoArvore no){
        if(no == null)
            return;

        System.out.printf("%d - ",no.value);
        preoderHelp(no.leftNode);
        preoderHelp(no.rigthNode);
    }

    public void inorder(){
        inoderhelp(raiz);
    }
    private void inoderhelp(NoArvore no){
        if(no == null)
            return;

        preoderHelp(no.leftNode);

        System.out.printf("%d - ",no.value);

        preoderHelp(no.rigthNode);
    }


    public void postoder(){
        postorderhelp(raiz);
    }
    private void postorderhelp(NoArvore no){
        if(no == null)
            return;

        preoderHelp(no.leftNode);
        preoderHelp(no.rigthNode);
        System.out.printf("%d - ",no.value);

    }

}
