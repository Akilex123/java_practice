package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public void exercise2(){
        Scanner sken = new Scanner(System.in);
        System.out.println("Koliko brojeva unosite? ");
        int brojMesta = sken.nextInt();
        int[] niz = new int[brojMesta];
        for (int i=0; i<brojMesta; i++) {
            System.out.print("Unesite broj: ");
            int vrednost = sken.nextInt();
            niz[i] = vrednost;

        }

        System.out.println(Arrays.toString(niz));
        int najveci = Arrays.stream(niz).max().getAsInt();
        int najmanji =  Arrays.stream(niz).min().getAsInt();
        double prosek = Arrays.stream(niz).average().getAsDouble();

        System.out.println(najveci);
        System.out.println(najmanji);
        System.out.println(prosek);

    }
}
