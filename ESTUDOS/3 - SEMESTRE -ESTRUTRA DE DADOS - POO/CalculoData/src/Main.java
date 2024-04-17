import java.util.Calendar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        Scanner ler = new Scanner(System.in);
        int anoatual = today.get(Calendar.YEAR);
        int mesatual = today.get(Calendar.MONTH) + 1;
        int diaatual = today.get(Calendar.DAY_OF_MONTH);
        int[] diasDosMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] diasDosMesesBI = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totaldias = 0;

        System.out.println("INFORME O DIA DE NASCIMENTO");
        int diauser = ler.nextInt();
        System.out.println("INFORME O MES DE NASCIMENTO");
        int mesuser = ler.nextInt();
        System.out.println("INFORME O ANO DE NASCIMENTO");
        int anouser = ler.nextInt();
        int anosustent = anouser;

        for(int j = anouser; j < anoatual; j++ , anosustent++){
            for(int i = 0; i < 12; i++){
                if(isAnoBissexto(anosustent) == true){
                    totaldias += diasDosMesesBI[i];
                }else if(isAnoBissexto(anosustent) == false){
                    totaldias+= diasDosMeses[i];
                }
            }
        }
        for(int i = 0; i < mesatual; i++){
            if(isAnoBissexto(anosustent) == true){
                totaldias += diasDosMesesBI[i];
            }else if(isAnoBissexto(anosustent) == false){
                totaldias+= diasDosMeses[i];
            }
        }
        totaldias = totaldias + diaatual - diauser;
        System.out.println("Você viveu " + totaldias + " dias.");
    }
    public static boolean isAnoBissexto(int ano){
        if (((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0))){
            return true;
        } else{
            return false;
        }
    }
}