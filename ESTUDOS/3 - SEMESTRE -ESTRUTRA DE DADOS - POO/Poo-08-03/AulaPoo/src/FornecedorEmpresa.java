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

    public String formatardados(String dado){
        dado = dado.replaceAll("\\.", "");
        dado = dado.replaceAll("-", "");
        dado = dado.replaceAll("/" , "");
        return dado;
    }
    public boolean confirmarg(String cnpjformat){
        cnpjformat = formatardados(CNPJ);
        String help = cnpjformat;
        int helpaux = 0;
        int aux = 0;
        int ultimodig = Integer.parseInt(cnpjformat.charAt(12) + "");
        boolean confirma = false;
        int j = 0;
        for(int i = 6 ; i < 10; i++, j++){
            int conv = Integer.parseInt(cnpjformat.charAt(j) + "");
            aux += conv * i;
        }
        for(int i = 2; i < 10; i++){
            int conv = Integer.parseInt(cnpjformat.charAt(j) + "");
            aux += conv * i;
        }
        helpaux = aux % 11;
        helpaux = helpaux - 11;
        int aux3 = 0;
        help = help + Integer.toString(helpaux);


        j = 0;
        for(int i = 6; i >= 2; i--, j++){
            int conv = Integer.parseInt(help.charAt(j) + "");
            aux3 += conv * i;
        }
        for(int i = 9; i >= 2; i--){
            int conv = Integer.parseInt(help.charAt(j) + "");
            aux3 += conv * i;
        }

        return  confirma;
    }
}
