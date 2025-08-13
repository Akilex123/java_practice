package org.example;

public class Zadatak {
    String tekst;
    boolean zavrsen;
    public Zadatak(String tekst, boolean zavrsen){
        this.tekst = tekst;
        this.zavrsen = zavrsen;


    }
    public void zadatakInfo(){
        System.out.println("Tekst zadatka je: " + tekst);

    }

}
