import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Arvore arvore = new Arvore();

        for(int i = 0; i < 10; i++){
            arvore.insert(rand.nextInt(100),arvore.root);
        }
        System.out.println("Pre order");
        arvore.preOrder(arvore.root);

        System.out.println();
        System.out.println("in order");
        arvore.inOrder(arvore.root);

        System.out.println();
        System.out.println("post-order");
        arvore.postOrder(arvore.root);
    }
}
