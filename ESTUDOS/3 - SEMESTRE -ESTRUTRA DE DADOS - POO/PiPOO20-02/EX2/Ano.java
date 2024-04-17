package EX2;
public class Ano {
    public static void main(String[] args) {
        int ano = 0;

        data date = new data();

        for(int i = 0; i <=2024; i++, ano++){
            date.SetAno(ano);
            if(date.isAnoBissexto() == true){
                System.out.println(ano);
            }
            else{
            }
        }
    }
}
