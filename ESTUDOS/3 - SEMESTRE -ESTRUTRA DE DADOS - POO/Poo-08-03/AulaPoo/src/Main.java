import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        FornecedorPessoa novo = new FornecedorPessoa();
        FornecedorEmpresa novoe = new FornecedorEmpresa();

        String rg = "39.239.844-8";
        String cnpj = "11.222.333/0001-81";

        novo.setRg(rg);
        novoe.setCNPJ(cnpj);
        boolean ae = novoe.confirmarg(cnpj);
        boolean ey = novo.confirmarg(rg);

        System.out.println(ey);
    }
}
