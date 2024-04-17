package Ex2;

public class Poo {
    //atributos
    String nome, sexo, frase;
    int pos,idade;
    
    //seters

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setFrase(String frase) {
        this.frase = frase;
    }
    public void setPos(int pos) {
        this.pos = pos;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    //metodos
    public void Pos(){
        for(int i = 0; i < pos; i++){
            System.out.print(nome.charAt(i)+ " ");
        }
    }
    public String imparpos(){
        String impar = "";
        for(int i = 0; i < nome.length();i++){
            if(i % 2 != 0){
                impar += nome.charAt(i);
            }
        }
        return impar;
    }
    public boolean aceitacao(){
        if(sexo.equals("feminino") && idade < 25){
            return true;
        }
        else{
            return false;
    }
}
public int cont(){
    int cont = nome.length();
    return cont;
}
public void Stringreturn(){
    for(int i = 0; i < nome.length(); i++){
        System.out.println(nome);
    }
}
public int[] contadorvogal(){
    int[] vogal = new int[5];
    int conta = 0;
    int conte = 0;
    int conti = 0;
    int conto = 0;
    int contu = 0;

    for(int i = 0; i < frase.length(); i++){
        if(frase.charAt(i) == equalsIgnoreCase(a)){
            conta++;
        }
        else if(frase.charAt(i) == equalsIgnoreCase(e)){
            conte++;
        }
        else if(frase.charAt(i) == equalsIgnoreCase(i)){
            conti++;
        }
        else if(frase.charAt(i) == equalsIgnoreCase(o)){
            conto++;
        }
        else if(frase.charAt(i) == equalsIgnoreCase(u)){
            contu++;
        }
    }
    vogal[0] = conta;
    vogal[1] = conte;
    vogal[2] = conti;
    vogal[3] = conto;
    vogal[4] = contu;

    return vogal;
}
}