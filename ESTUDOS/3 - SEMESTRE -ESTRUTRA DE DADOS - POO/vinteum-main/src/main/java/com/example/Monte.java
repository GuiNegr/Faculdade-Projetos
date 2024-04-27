package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Monte {
    private List<Carta> cartas = new ArrayList<>();

    public Monte(){
        Random rd = new Random();

        Naipe[] naipes = {Naipe.Hearts,Naipe.Spades, Naipe.Diamons,Naipe.Clubs };
        int[] cartan = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        for (int i = 0; i < 52; i++){
            int j = rd.nextInt(3);
            int a = rd.nextInt(12);
            Carta novaCard = new Carta(cartan[a],naipes[j]);
            if(cartan[a] == 11 || cartan[a] == 12 || cartan[a] == 13){
                novaCard.setNumero(10);
            }
            if(!cartas.contains(novaCard)){
                cartas.add(novaCard);
            }
        }
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }
    
    public Carta virar(){
        Carta primeira  = cartas.get(0);
        cartas.remove(0);
        return primeira;
    }
}
