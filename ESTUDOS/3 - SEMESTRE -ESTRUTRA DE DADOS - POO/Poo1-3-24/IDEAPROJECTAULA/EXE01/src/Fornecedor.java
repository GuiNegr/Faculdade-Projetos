public class Fornecedor {
    private String nome, fone;

    public Fornecedor(){}
    public Fornecedor (String nome, String fone){
        this.nome = nome;
        this.fone = fone;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public String getFone() {
        return fone;
    }


    public static void main(String[] args) {

        FornecedorPessoa fp = new FornecedorPessoa("MARCOS", "1198989-9874"
                , "123456-6", "056745987-55");
        System.out.println(fp);
    }
}
