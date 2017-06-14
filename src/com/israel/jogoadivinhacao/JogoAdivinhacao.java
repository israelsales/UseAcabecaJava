package com.israel.jogoadivinhacao;

/**
 * Created by Israel Sales on 14/06/2017.
 */
public class JogoAdivinhacao {
    Jogador jogador1;
    Jogador jogador2;
    Jogador jogador3;

    public void iniciarJogo(){
        jogador1 = new Jogador();
        jogador2 = new Jogador();
        jogador3 = new Jogador();

        int palpiteJogador1 =0;
        int palpiteJogador2 =0;
        int palpiteJogador3 =0;

        boolean jogador1EstaCerto = false;
        boolean jogador2EstaCerto = false;
        boolean jogador3EstaCerto = false;

        int numeroAlvo = (int)(Math.random()*10);
        System.out.println("Estou pensando em um número entre 0 a 9...");

        while (true){
            System.out.println("O número a adivinhar é: " +numeroAlvo);
            jogador1.advinhar();
            jogador2.advinhar();
            jogador3.advinhar();

            palpiteJogador1 = jogador1.numero;
            System.out.println("O jogador 1 forneceu o palpite: " +palpiteJogador1);

            palpiteJogador2 = jogador2.numero;
            System.out.println("O jogador 2 forneceu o palpite: " +palpiteJogador2);

            palpiteJogador3 = jogador3.numero;
            System.out.println("O jogador 3 forneceu o palpite: " +palpiteJogador3);

            if(palpiteJogador1 == numeroAlvo){
                jogador1EstaCerto = true;
            }
            if(palpiteJogador2 == numeroAlvo){
                jogador2EstaCerto = true;
            }
            if(palpiteJogador3 == numeroAlvo){
                jogador3EstaCerto = true;
            }

            if(jogador1EstaCerto||jogador2EstaCerto||jogador3EstaCerto){
                System.out.println("Temos um vencedor!");
                System.out.println("O jogador 1 acertou? " +jogador1EstaCerto);
                System.out.println("O jogador 2 acertou? " +jogador2EstaCerto);
                System.out.println("O jogador 3 acertou? " +jogador3EstaCerto);
                System.out.println("Fim do Jogo. ");
                break;
            }else{
//                devemos continuar porque ninguém acertou!
                System.out.println("Os jogadores terão que tentar novamente.");
            }//fim do if/else
        }//fim do loop
    }//fim do método
}// fim da classe
