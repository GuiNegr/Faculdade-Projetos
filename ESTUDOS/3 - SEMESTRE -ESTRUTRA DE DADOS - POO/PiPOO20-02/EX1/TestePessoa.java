package EX1;
public class TestePessoa {
    public static void main(String[] args) {
        String nome = "João";
        int idade = 20;
        String endereço = "Rua Paramapiacaba, 20 CEP 38080-30";
        Pessoa João = new Pessoa(nome,idade,endereço);


        Pessoa Maria = new Pessoa();
        Maria.SetNome("Maria"); 
        Maria.SetIdade(68);
        Maria.SetEndereço("Rua dos Limões , 307A bloco b apto 41  CEP 0184810-30");

        System.out.println("Nome: "+João.GetNome()+ "Idade: "+João.getIdade()+"Endereço: "+João.getEndereço());
        System.out.println();
        System.out.println("Nome: "+Maria.GetNome()+"Idade: "+Maria.getIdade()+"Endereço: "+Maria.getEndereço());
    }
}
