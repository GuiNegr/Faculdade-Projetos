package com.example;

import java.util.ArrayList;
import java.util.List;


public class Jogador{
    private int pontos = 0;
    private List<Carta> cartas = new ArrayList<>();
    private boolean parou = false;

    public void receberCarta(Carta carta){
        cartas.add(carta);
        if(carta.getNumero() > 10) pontos += 10;
        pontos += carta.getNumero();
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }


    public void setParou(boolean parou) {
        this.parou = parou;
    }

    public Boolean parou(){
        return parou;
    }
}