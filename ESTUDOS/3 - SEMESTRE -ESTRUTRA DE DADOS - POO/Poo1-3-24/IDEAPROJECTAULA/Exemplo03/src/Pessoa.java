public class Pessoa {
    private String nome, endereco, tel;
    private int idade;

    public Pessoa(String nome,int idade, String endereco, String tel){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", emdereço='" + endereco + '\'' +
                ", tel='" + tel + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa("leandro" , 22 , "Rua XV", "25868-5814");
        String str = p.toString();
        System.out.println(str + "\n");
        System.out.println(p);
    }
}
