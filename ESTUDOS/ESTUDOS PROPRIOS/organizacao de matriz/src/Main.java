import java.util.*;


public class Main {
    public static void main(String[] args) {

        int[][] m = gerarmatriz();
        exibir(m);
        System.out.println();
        m = organizar(m);
        exibir(m);



    }
    public static int[][] organizar(int[][] m){

        //PONTEIRO PRINCIPAL
        for(int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++){
                //PONTEIRO SECUNDARIO
                for(int k = 0; k<m.length; k++){
                    for(int l = 0; l<m.length;l++){
                        if(m[i][j] < m[k][l]){
                            int aux = m[k][l];
                            m[k][l] = m[i][j];
                            m[i][j] = aux;
                        }
                    }
                }
            }
        }
        return m;
    }




    public static int[][] gerarmatriz() {
        Random rand = new Random();

        int length = rand.nextInt(10);

        int[][] m = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int a = rand.nextInt(100);
                m[i][j] = a;
            }
        }

        return m;
    }
    public  static void exibir(int[][] matriz){
        for(int i = 0; i < matriz.length;i++){
            System.out.print("[");
            for (int j = 0 ; j < matriz.length; j++){
                System.out.print(matriz[i][j] +",");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}