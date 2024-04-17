package TODASASADO;
import java.util.Scanner;
public class exe0503 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual é o personagem de Friends que trabalha com TI?”");
        String resp = ler.next();

        boolean status = false;
        if(resp.equalsIgnoreCase("joey")){
            status = true;
        }

        System.out.println("Resposta está correta? "+status);
        ler.close();
    }
}
