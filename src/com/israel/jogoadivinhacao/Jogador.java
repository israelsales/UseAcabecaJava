package com.israel.jogoadivinhacao;

/**
 * Created by Israel Sales on 14/06/2017.
 */
public class Jogador {
    int numero=0;

    public void advinhar(){
        numero = (int)(Math.random()*10);
        System.out.println("Estou pensando em: " +numero);
    }
}
