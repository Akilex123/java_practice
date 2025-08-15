package org.example;
import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        // Pravimo skener za unos brojeva i operatora
        Scanner sken = new Scanner(System.in);

        // Pravimo varijable koje drze te brojeve
        int prviBroj = 0;
        int drugiBroj = 0;
        try {
            System.out.print("Koji je vas prvi broj?: ");
            prviBroj = sken.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Vas unos mora biti broj");
        }
        try {
            System.out.print("Koji je vas drugi broj?: ");
            drugiBroj = sken.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Vas unos mora biti broj");
        }
        System.out.println(prviBroj);
        System.out.println(drugiBroj);

        //Pravimo varijablu koja drzi rezultat
        int rezultat = 0;


        // Pravimo varijablu koja uzima operator
        String operator;
        

        }
    }


