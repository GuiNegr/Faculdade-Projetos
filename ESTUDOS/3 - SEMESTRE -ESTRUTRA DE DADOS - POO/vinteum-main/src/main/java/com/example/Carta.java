package com.example;

public class Carta{
    private int numero;
    private Naipe naipe;
    public Carta(int numero,Naipe naipe){
        this.numero = numero;
        this.naipe = naipe;
    }

    public String imagePath(){
        if (numero == 1){
            return "classic-cards/Ace" + this.naipe +".png";
        }
         if(numero == 11){
            return "classic-cards/Jack" + this.naipe +".png";
        }
         if(numero == 12 ){
            return "classic-cards/Queen" + this.naipe +".png";
        }
         if(numero == 12){
            return "classic-cards/King" + this.naipe +".png";
        }

            return "classic-cards/" + numero + this.naipe +".png";


    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

}