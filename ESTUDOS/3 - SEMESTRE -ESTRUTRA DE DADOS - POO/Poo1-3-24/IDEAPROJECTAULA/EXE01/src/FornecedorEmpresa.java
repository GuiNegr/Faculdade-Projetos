public class FornecedorEmpresa extends Fornecedor {
    private String IE, CNPJ;

    public FornecedorEmpresa(){}

    public void FornecedorPessoa(String nome, String fone, String IE, String CNPJ){
        super.setFone(fone);
        super.setNome(nome);
        this.IE = IE;
        this.CNPJ = CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getIE() {
        return IE;
    }



    @Override
    public String toString() {
        return "FornecedorEmpresa [ie=" + IE + ", cnpj=" + CNPJ + ", "
                + ", Nome =" + getNome() + ", Fone =" + getFone() + "]";
    }
}
