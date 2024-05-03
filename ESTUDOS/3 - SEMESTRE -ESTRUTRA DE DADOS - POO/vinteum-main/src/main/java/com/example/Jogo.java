package com.example;

public class Jogo {
    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo(){
        monte.embaralhar();
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public Carta distribuiCartaParaJogador(Jogador jogador){
        if(!jogador.parou()){
            Carta carta =  monte.virar();
            jogador.receberCarta(carta);
            return carta;
        }else{
            return null;
        }
    }

    public boolean acabou(){
        if (jogador.getPontos() > 21 || computador.getPontos() > 21){
            return true;
        }
        else{
            return false;
        }
    }

    public String resultado(){
       computador.setParou(true);
       jogador.setParou(true);
       String a = "";
       if(jogador.getPontos() == 21){
           a = "voce ganhou";
       }
       else if(computador.getPontos() == 21){
           a = "voce perdeu";
       }
       else if(jogador.getPontos() < 21 || computador.getPontos() > 21){
           a = "quase lá";
       }
       else if(computador.getPontos() < 21 || computador.getPontos() > 21){
           a = "quase la ´pc";
       }
       return a;
    }
}
