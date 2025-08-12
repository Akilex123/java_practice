package org.example;

public class Pokemon {
    String name;
    int level;
    Pokemon(String name, int level){
        this.name = name;
        this.level = level;
    }

    void attack(){
        System.out.println(name + " " + "attack!");
    }
}
