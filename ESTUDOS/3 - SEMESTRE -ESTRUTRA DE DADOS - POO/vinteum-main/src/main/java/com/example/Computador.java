package com.example;

public class Computador extends Jogador{

    @Override
    public Boolean parou(){
        return getPontos() >= 16;
    }
}
