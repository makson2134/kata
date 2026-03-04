package org.example;

import java.util.Random;
import java.util.Timer;

public class Kombat {

    static void begin(Warrior war1, Warrior war2){
        Random rnd = new Random();
        while (war1.health > 0 && war2.health > 0){
            switch (rnd.nextInt(2)){
                case 0:
                    war1.attack(war2);
                    break;
                case 1:
                    war2.attack(war1);
            }
        }
    }
}
