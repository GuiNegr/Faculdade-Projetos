//comando break funciona para parar a repetição, quando ele parece ele condiciona a sair da repetição

public class Main {
    public static void main(String[]args){
        Vetor vetor = new Vetor(5); //utilizando o construtor com o parametro passado

        try{ // utilizando o throws temos que utilziar o try catch para conseguir fazer o tratamento de erros e trabalhos corretos
            vetor.adiciona("1");
            vetor.adiciona("2");
            vetor.adiciona("1");
            vetor.adiciona("2");
            vetor.adiciona("1");
            vetor.adiciona("2");
            vetor.adiciona("1");
            vetor.adiciona("2");
            vetor.adiciona("1");
            vetor.adiciona("2");
            vetor.adiciona("2");
            vetor.adiciona("1");
            vetor.adiciona("2");
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("A QUANTIDADE DE ITEMS ARMAZENADO NO VETOR É "+vetor.tamanho());

        System.out.println("OS VALORES SÃO: "+vetor.toString());

        try{
            System.out.println(vetor.buscaPos(1));
        }catch (Exception e ){
            e.printStackTrace();
        }
        System.out.println(vetor.buscaArray("1"));

       try{
           vetor.adicionainicio(1,"eita funcionou");
       }
       catch (Exception e){
           e.printStackTrace();
       }
        System.out.println("OS VALORES SÃO: "+vetor.toString());

       try {
           vetor.remove(1);
       }
       catch (Exception e){
           e.printStackTrace();
       }
        System.out.println("OS VALORES SÃO: "+vetor.toString());
    }
}
