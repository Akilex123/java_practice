package org.example;
import javax.sound.midi.Soundbank;
import java.util.*;

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
            sken.nextLine();
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


        //Pravimo varijablu koja drzi rezultat



        // Pravimo varijablu koja uzima operator
        System.out.print("Izaberite vas operator: ");
        String operator= sken.nextLine();


        if (operator.equals("+")){
            System.out.println(prviBroj + drugiBroj);
        } else if (operator.equals("-")) {
            System.out.println(prviBroj - drugiBroj);
        }
        else if (operator.equals("*")) {
            System.out.println(prviBroj * drugiBroj);
        }
        else if (operator.equals("/")) {
            if (drugiBroj == 0){
                System.out.println("Ne mozete deliti sa 0!");
            }
            System.out.println(prviBroj / drugiBroj);
        }

    }
    }


  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }






