package com.useacabecajava.simpledotcom;

public class SimpleDotCom {

    int[] locationCells;
    int numOfHits=0;

    //            Capiture o palpite do usuario como um parametro de String
    String checkYourself(String stringGuess) {

//        Converta o palpite do usuario em um int
        int intGuess = Integer.parseInt(stringGuess);

//        cria uma variavel para armazenar o resultado que retornaremos. Insere "miss" como o padrao
//        (isto é, estamos presumindo que ocorrerá um "erro")
        String result = "miss";

//        repete para cada celula da matriz locationCells (cada local de celulas do objeto)
        for (int cell : locationCells) {

//            compara o palpite do usuario com esse elemento (celula) da matriz
            if (intGuess == cell) {
                result = "hit"; //tivemos um acerto
                numOfHits++;
                break; //sai do loop, nao é preciso testar as outras celulas
            }
        }

//        estamos fora do loop, mas vejamos se já terminamos (acertamos 3 vezes) e alteramos a string do resultado
//        para "kill"
        if(numOfHits==locationCells.length){
            result = "kill";
        }

//        exibe o resultado para o usuario ("miss", a menos que seja alterado para "hit" ou "kill")
//        System.out.println(result);

        return result;
    }

    void setLocationCells(int[] locs) {
        locationCells = locs;
    }
}
