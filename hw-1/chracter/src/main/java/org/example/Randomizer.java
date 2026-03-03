package org.example;

import java.util.Random;

public class Randomizer {
    Character newCharacter(){
        Random rnd = new Random();
        int nameLen = rnd.nextInt(10);
        int weaponLen = rnd.nextInt(7);

        int atk = rnd.nextInt(20);
        String name = randomString(nameLen);
        String weapon = randomString(weaponLen);

        return new Character(name, weapon, atk);

    }

    private String randomString(int len){
        Random rnd = new Random();
        final String chars = "abcdefghijklmnopqrstuvwzyx";

        StringBuilder salt = new StringBuilder();
        while (salt.length() < len){
            int ind = rnd.nextInt(len);
            salt.append(chars.charAt(ind));
        }

        return salt.toString();
    }
}
