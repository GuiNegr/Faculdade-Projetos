import java.lang.Object;
public class FornecedorPessoa extends Fornecedor {
    private  String rg, cpf;
    public FornecedorPessoa(){}

    public FornecedorPessoa(String fone, String nome, String rg, String cpf){
        super(nome,fone);
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

    public String formatardados(String dado){
        dado = dado.replaceAll("\\.", "");
        dado = dado.replaceAll("-", "");
        return dado;
    }

    public boolean confirmarg(String rgformat){
         rgformat = formatardados(rg);
         int aux = 0;
         int ultimodig = Integer.parseInt(rgformat.charAt(8) + "");
         int aux2 = ultimodig * 9;
         boolean confirma = false;
         for(int i = 1 , j = 2; i < 8; i++, j++){
             int conv = Integer.parseInt(rgformat.charAt(i) + "");
             aux += conv * j;
         }
         aux = aux + aux2;
         int resto = aux % 11;
         aux = aux - resto;
         if(aux == ultimodig){
             confirma = true;
         }
         return  confirma;
    }
}
