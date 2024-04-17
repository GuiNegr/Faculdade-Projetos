public class Interseccao{
    public static void main (String[] args){

        int[] A = {7, 2, 5, 8, 4};
        int[] B = {4, 2 , 9 , 5};
        String resultado = check(A, B);
        System.out.println(resultado);
    }public static String check(int[] A, int[] B){
        String resultado = "";
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                if(A[i] != B[j]){
                    resultado = B[j] + " " + resultado;
                    break;
                }
            }
        }
        return resultado;
    }
}