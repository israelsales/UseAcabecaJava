package com.useacabecajava.simpledotcom;

import java.util.Scanner;

public class SimpleDotGame {

    public static void main(String[] args) {

        int numeroDePalpites = 0;
        SimpleDotCom dotCom = new SimpleDotCom();
        int posicaoInicial = (int) (Math.random() * 5);
        int[] alocacaoDeCelulas = {posicaoInicial,posicaoInicial+1,posicaoInicial+2};
        dotCom.setLocationCells(alocacaoDeCelulas);
        boolean isAlive = true;
        Scanner scanner = new Scanner(System.in);
        while (isAlive){
            System.out.print("Insira um numero: ");
            String palpite = scanner.next();
            String resultado = dotCom.checkYourself(palpite);
            numeroDePalpites++;
            if(resultado.equals("kill")){
                isAlive = false;
            }

            if(resultado.equals("hit")){
                System.out.println("Correto");
            }else {
                System.out.println("Tente de novo...");
            }
        }
        System.out.println("Você usou " +numeroDePalpites +" palpites.");
    }
}
