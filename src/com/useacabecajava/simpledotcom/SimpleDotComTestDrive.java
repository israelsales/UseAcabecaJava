package com.useacabecajava.simpledotcom;

public class SimpleDotComTestDrive {

    public static void main(String[] args) {
//        instancia um objeto SimpleDotCom
        SimpleDotCom dot = new SimpleDotCom();

//        cria uma matriz int para o local das dot com (3 ints consecutivos entre 7 possiveis)
        int[] locations={2,3,4};

//        chama o metodo de configuracao na variavel dotCom
        dot.setLocationCells(locations);

//        cria um palpite de usuario ficticio
        String userGuess ="2";

//        chama o metodo checkYourself() no objeto dotCom e passa para ele o palpite ficticio
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";

//        se o palpite ficticio {2} retornar um "acerto", o codigo estara funcionando
        if(result.equals("hit")){
            testResult = "passed";
        }

//        exibe o resultado do teste (bem-sucedido ou com falhas)
        System.out.println(testResult);
    }
}
