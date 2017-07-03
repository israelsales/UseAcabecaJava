package com.useacabecajava.beersong;

/**
 * Created by Israel Sales on 03/07/2017.
 * pagina livro-10, pdf-36
 */
public class BeerSong {
    public static void main(String[] args) {
        int beerBum = 9;
        String word = "bottles";

        while (beerBum > 0) {
            System.out.println(beerBum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerBum = beerBum - 1;

            if (beerBum > 0) {
                if (beerBum == 1) {
                    word = "bottle";
                }
                System.out.println(beerBum + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
        }

    }
}
