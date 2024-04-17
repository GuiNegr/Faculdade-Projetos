import java.util.Scanner;
class matriz{
    int[][] matriz;
    int x;
    Scanner ler = new Scanner(System.in);
    boolean Vazia;

    
    public void GetMatriz(int[][] matriz){
        this.matriz = matriz;
    }

    public void Getx(int x){
        this.x = x;
    }

    public int[][] constructor(int x){
        int [][] constructor = new int[x][x];
        return constructor;
    }

    public void prencher(int [][] matriz){
        System.out.println("Preencha a matriz");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = ler.nextInt();
            }
        }
    }
    public void imprimir(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.println(matriz[i][j]);
            }
        }
    }

    public int menorM(int[][] matriz){
        int menorM = matriz[0][0];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length;j++){
                if(menorM < matriz[0][0]){
                    menorM = matriz[0][0];
                }
            }
        }
        return menorM;
    }

    public int MaiorM(int[][] matriz){
        int MaiorM = matriz[0][0];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length;j++){
                if(MaiorM < matriz[0][0]){
                    MaiorM = matriz[0][0];
                }
            }
    }
    return MaiorM;
    }
    public int somadp(int[][] matriz){
        int somadp = 0;
        for(int i = 0; i < matriz.length; i++){
            somadp += matriz[i][i];
        }
        return somadp;
    }
    public int somads(int[][] matriz){
        int somads = 0;
        int x = matriz.length - 1;
        for(int i = 0; i < matriz.length; i++){
            somads += matriz[x][i];
            x--;
        }
        return somads;
    }
    public int somageral(int[][] matriz){
        int soma = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j< matriz.length; j++){
                soma+= matriz[i][j];
            }
        }
        return soma;
    }
}