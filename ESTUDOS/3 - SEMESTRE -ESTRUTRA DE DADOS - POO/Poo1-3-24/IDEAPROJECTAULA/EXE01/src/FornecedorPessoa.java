public class FornecedorPessoa extends Fornecedor {
    private  String rg, cpf;
    public FornecedorPessoa(){}

    public FornecedorPessoa(String fone, String nome, String rg, String cpf){
        super.setFone(fone);
        super.setNome(nome);
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "FornecedorPessoa\nRG = " + rg + ", CPF = "
                + cpf + ", " + " \nNome = " + getNome()
                + ",  Fone = " + getFone()+ "\n\n";
    }
}
