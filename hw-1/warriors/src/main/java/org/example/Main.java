package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Warrior warrior1= new Warrior(20, 100, "Ваня");
        Warrior warrior2 = new Warrior(20, 100, "Петя");

        Kombat.begin(warrior1, warrior2);
    }
}