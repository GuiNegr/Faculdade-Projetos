
//POLIFORMISMO VOCE PODE CRIAR VARIOS METODOS COM O MESMO NOME, E O PROGRAMA ALTERARAR O METODO DEPENDENDO DO QUE FOR PASSADO COMO PARAMETRO
public class Calculadora {
    public int soma(int a , int b){
        return a + b;
    }
    public int soma(int a , int b , int c){
        int resultado = this.soma(a, b) + c;
        return resultado;
    }
    public float soma(float a, float b){
        return a + b;
    }
    public long soma(int[] numeros){
        long resultado = 0;
        for(int i = 0; i < numeros.length;i++){
            resultado+= numeros[i];
        }
        return resultado;
    }
}
