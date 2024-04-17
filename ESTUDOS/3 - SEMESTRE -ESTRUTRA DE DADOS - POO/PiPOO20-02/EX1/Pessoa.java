package EX1;

//classe pessoa está ENCAPSULADA

public class Pessoa {
    private String  nome = null;
    private int idade = 0; 
    private String endereço = null;

    public Pessoa (String n , int i, String e ){ // construtor alternativo
    SetNome(n);
    SetIdade(i);
    SetEndereço(e);
    }

    public Pessoa(){//construtor padrão

    }


    public void SetNome(String nome){
        this.nome = nome;
    }

    public void SetIdade(int idade){
        this.idade = idade;
    }

    public void SetEndereço(String endereço){
        this.endereço = endereço;
    }

    public String GetNome(){
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}