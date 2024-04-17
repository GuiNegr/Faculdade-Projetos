public class Fila extends Paciente {
    public Paciente[] fila;
    public int quantidade;

    public int contador;
    public Fila(int tamanho) {
        this.fila = new Paciente[tamanho];
        this.quantidade = 0;
    }

    public void setContador(int contador) {
        this.contador = 0;
    }

    public void aumenta() {
        if (this.quantidade == this.fila.length) {
            Paciente[] novafila = new Paciente[this.fila.length * 2];
            for (int i = 0; i < quantidade; i++) {
                novafila[i] = fila[i];
            }
            this.fila = novafila;
        }
    }

    public void add(Paciente pacienteatual) {
        aumenta();
        if (quantidade < fila.length) {
            fila[quantidade] = pacienteatual;
            quantidade++;
            }
            }
    public Boolean estaVazia() {
        return this.quantidade == 0;
    }

    public void remove(int posicao) {
        for (int i = posicao; i < quantidade - 1; i++) {
            fila[i] = fila[i + 1];
        }
        quantidade--;
    }

    public void desenfileira() {

        if (estaVazia()) {
            System.out.println("FOI CHAMADO TODO MUNDO");
        } else {
            if(contador < 3){
                chamarPreferencial();
                this.contador++;
            }
            else if(contador == 3){
                chamarNormal();
                setContador(0);
            }
        }
        }

    public void informaçoes(){
        String[] help = new String[fila.length];
        for(int i = 0; i < fila.length; i++){
            help[i] = "NOME DO PACIENTE:"+fila[i].getNome()+ "\n ESTADO: "+fila[i].getEstado();
        }
        if (estaVazia()){
            System.out.println("NÃO HÁ INFORMAÇÕES PARA EXIBIR");
        }else {
            for(String item: help){
                System.out.println(item);
            }
        }
    }
    public void chamarPreferencial(){
        for(int i = 0; i < quantidade;i++){
           if(fila[i].getEstado().equalsIgnoreCase("Emergencia")){
               Paciente pacientenovo = fila[i];
               remove(i);
               System.out.println("PACIENTE " + pacientenovo.getNome().toUpperCase() + " COMPARECER AO BALCÃO (preferencial)");
               break;
           }

        }
    }
    public void chamarNormal(){
        for(int i = 0; i < quantidade;i++){
            if(fila[i].getEstado().equalsIgnoreCase("Normal")){
                Paciente pacientenovo = fila[i];
                remove(i);
                System.out.println("PACIENTE " + pacientenovo.getNome().toUpperCase() + " COMPARECER AO BALCÃO (normal)");
                break;
            }

        }
    }

}



