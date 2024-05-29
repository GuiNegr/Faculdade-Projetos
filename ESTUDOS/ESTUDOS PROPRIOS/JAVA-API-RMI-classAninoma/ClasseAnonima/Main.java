// TO compilando isso no vsCode por preguiça de abrir o inteliJ

import javax.swing.JOptionPane;

public class Main {

    public static class Macaco {
        public void gritar() {
            System.out.println("UAUAUAUAUA");
        }
    }

    


    // teste de um negocio
    // a ideia e ver se posso chamar um metodo sem exibir o retorno dele
    // também complicando algo facil
    public static class Elefante{
        private String elefantinho = "tomate";
        public String[] elefantes = new String[2];
        private int cont = 0;
        protected boolean itsWork(String valor){
                if(valor.equals(this.elefantinho)){
                    Elefante elefante = new Elefante(){
                        protected boolean itsWork(String valor){
                            if(cont < elefantes.length){
                                elefantes[cont] = valor;// estou alterando sempre somente o valor desse objeto criado, ele nunca aparecerá. virou um objeto local, com funçoes locais entçao posso fazer um loop de manipulações dentro das manipulações sem ter o risco de afetar fora
                                cont++;
                                System.out.println("adição funcionou");
                                return true;
                            }
                            else return false;
                        }
                    };
                        if(elefante.itsWork(valor)){
                            return true;
                        }else return false;     
                }
                else
                    {
                        System.out.println("elefante ta cheio bixo");
                        return false;
                    }
        }

        public void displayElefantes() {
            System.out.println("Conteúdo do array elefantes:");
            for (String elefante : elefantes) {
                System.out.println(elefante);
            }
        }
    }

    public static void main(String[] args) {


        //teste para funçao anonima
        Macaco monkey = new Macaco() {
            public void gritar() {
                JOptionPane.showMessageDialog(null, "MACACO BARULHOS MOMENTS");
            }
        };

        //teste de Lambda

       // Macaco gorila = () ->{};

       /*Lambdas precisa de implementações de interfaces funcionais para conseguir serem utilizadas
        * alguns methodos como addEventListener ja implementa essa interface para voce poder utilizar elas
        */


        monkey.gritar();

        Macaco macaco = new Macaco();

        macaco.gritar(); 

        Elefante burro = new Elefante();
        
        burro.itsWork("tomate");
        burro.itsWork("marrom");
        System.out.println(burro.elefantes[0]);
        System.out.println(burro.elefantes[1]);
        System.out.println(burro.cont);
    
    }

}
