package org.example;
import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Treba da napravim Hashmap<String, Double> inventar
    public static HashMap<String, Double> inventar = new HashMap<>();

    public static void main(String[] args) {
        Scanner sken = new Scanner(System.in);
        int izbor;
        //Napravi tako da se ispise ceo meni
        do {
            System.out.println("Meni");
            System.out.println("***********");
            System.out.println("1 - Dodaj proizvod");
            System.out.println("2 - Prikazi sve proizvode");
            System.out.println("3 - Pronadji proizvod po nazivu");
            System.out.println("4 - Izlaz");
            System.out.print("Izaberite vas broj: ");

            izbor = sken.nextInt();
            sken.nextLine();

            //Napravi switch tako da za svaki broj bude odradjena jedna funkcija
            switch (izbor){
                case 1 -> dodajProizvod(sken);
                case 2 -> prikazProizvoda();
                case 3 -> pronalazenjeProizvoda(sken);
                case 4 -> System.out.println("Hvala na koriscenju!");
                default -> System.out.println("Niste uneli dobar broj");
            }
        } while (izbor != 4);















        // Izmena cene opciona



        }
    // Metoda za dodavanje proizvoda
    public static void dodajProizvod(Scanner sken){
        System.out.print("Koji je naziv vaseg proizvoda? ");
        String naziv = sken.nextLine();
        System.out.print("Koja je cena vaseg proizvoda? ");
        Double cena = sken.nextDouble();
        inventar.put(naziv,cena);
        System.out.println("Proizvod dodat!");
    }
    // Metoda za prikaz svih proizvoda sa for
    public static void prikazProizvoda(){
        for (String i : inventar.keySet()){
            System.out.println("naziv: " + i + ", cena: " + inventar.get(i));
        }
    }
    // Pronalazenje proizvoda po nazivu
    public static void pronalazenjeProizvoda(Scanner sken){
        System.out.print("Koji biste proizvod zeleli da nadjete?: ");
        String naziv = sken.nextLine();
        if (inventar.containsKey(naziv)){
            System.out.println(naziv + " " + inventar.get(naziv));
        } else {
            System.out.println("Taj proizvod ne postoji");
        }
    }

    }


