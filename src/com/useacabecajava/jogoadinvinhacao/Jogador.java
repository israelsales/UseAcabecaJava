package com.useacabecajava.jogoadinvinhacao;

class Jogador {
    int numero = 0;

    void advinhar() {
        numero = (int) (Math.random() * 10);
        System.out.println("Estou pensando em: " + numero);
    }
}
