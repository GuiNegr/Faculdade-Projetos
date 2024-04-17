import java.util.Arrays;

public class Vetor {
    private String[] elementos; // private significa que está so sendo utilizado nessa propria classe, precisando de um metodo de acesso gets e sets
    private int tamanho;

    public Vetor(int capacidade){ // aqui está um construtor, ele obriga na hora de fazer a chamada referencial, ter um parametro para ser utilizado
        this.elementos= new String[capacidade]; // this e um pontuamento para referencia de um atributo
        this.tamanho = 0;
    }


    public void adiciona(String elemento) throws Exception{// o trhos faz tratamento de erro para conseguir exbir com mais exatidao oque estaria errado
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }else {
            aumentaCapacidade();
        }
    }
    public int tamanho(){
        return this.tamanho;
    }

    // override e uma anotação para poder sobreescrever um metodo
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }// aqui vai percorrer até o penultima posição para fazer a inserção das virgulas
        if(this.tamanho > 0){
            s.append(this.elementos[this.tamanho - 1]);
        }// apos isso vai checar a ultima posição
        s.append("]");
        // e inseiri O ULTIMO ata esse metodo retorna so um array construido
        return s.toString();
    }
    public String buscaPos(int pos) throws Exception{
        if(pos >= 0 && pos < tamanho){
            return elementos[pos];
        }else{
            throw new Exception("posição invalida");
        }
    }
    public int buscaArray(String elemento){
        for(int i = 0; i < tamanho; i++){
            if(elementos[i].equalsIgnoreCase(elemento)){
                return i;
            }
        }
        return -1;
    }
    public boolean adicionainicio(int posicao, String elemento) throws Exception{
        this.aumentaCapacidade();
        if(posicao >= 0 && posicao < tamanho){
            for(int i = this.tamanho - 1; i >= posicao; i--){
                this.elementos[i+1] = this.elementos[i];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;
        } else{
            throw new Exception("Posição invalida");
        }
        return  true;
    }
    public void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            String[] elementosNovos = new  String[this.elementos.length * 2];
            for(int i = 0; i < elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;// com isso feito o apontamento de array virou um array maior agora
        }
    }
    public void remove(int pos)throws Exception{
        if(pos >= 0 && pos < tamanho){
            for(int i = pos; i < this.tamanho - 1 ;i++){
                this.elementos[i] = this.elementos[i + 1];
            }
            this.tamanho--;
        }else {
            throw new Exception("Posição invalida");
        }
    }
}
