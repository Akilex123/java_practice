package org.example;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Zadatak> zadaci = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sken = new Scanner(System.in);
        int izbor;
        do {
            System.out.println("Izaberite opciju koju zelite");
            System.out.println("1 - dodaj zadatak");
            System.out.println("2 - prikazi sve zadatake");
            System.out.println("3 - zasvrsi program");
            izbor = sken.nextInt();
            sken.nextLine();
            switch (izbor){
                case 1 -> dodajZadatak(sken);
                case 2 -> prikazZadataka(sken);

            }


        } while (izbor != 3);

    }

    public static void dodajZadatak(Scanner sken){
        System.out.println("Unesite tekst zadatka: ");
        String tekst = sken.nextLine();
        System.out.println("Da li je zadatak zavrsen: ");
        boolean zavrsen = sken.nextBoolean();
        sken.nextLine();

        Zadatak noviZadatak = new Zadatak(tekst, zavrsen);
        zadaci.add(noviZadatak);
        System.out.println("Zadatak dodat!");
    }

    public static void prikazZadataka(Scanner sken){
        if (zadaci.isEmpty()){
            System.out.println("Lista je prazna!");
        }
        else {
            for (Zadatak k: zadaci){
                k.zadatakInfo();
            }
        }
    }
}