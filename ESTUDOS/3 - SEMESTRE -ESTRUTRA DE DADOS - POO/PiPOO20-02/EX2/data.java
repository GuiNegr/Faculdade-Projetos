package EX2;
public class data {
    private int ano;
    private byte mes;
    private byte dia;
    public int getAno(){
        return ano;
    }
    public void SetAno(int a){
        if(a> 0){
            this.ano = a;
        }
        else{
            System.out.println("ANO INVALIDO");
        }
    }
    public byte getDia(){
        return dia;
    }
    public void setDia(byte d){
        if(d > 0 && d <= 31){
            this.dia = d;
        }
        else{
            System.out.println("Dia Invalido");
        }
    }

    public byte getMes(){
        return mes;
    }
    public void ajustarmes(byte m){
        if(m > 0 && m <= 12){
            this.mes = m;
        }
        else{
            System.out.println("Mes Invalido");
        }
    }
    public boolean isAnoBissexto(){
        if (((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0))){
            return true;
        } else{
            return false;
        }
    }

    public void imprimir(int ano, byte dia, byte mes){
        System.out.println(dia+"/"+mes+"/"+ano+" O ANO É BISSEXTO? "+isAnoBissexto());
    }
    }
