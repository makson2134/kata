package org.example;

public class Character {
    String name;
    String weapon;
    int atkCoefficient;

    Character(String name, String weapon, int atkCoefficient){
        this.name = name;
        this.weapon = weapon;
        this.atkCoefficient = atkCoefficient;

        introduce();
    }

    private void introduce(){
        System.out.printf("моё имя: %s, моё оружие %s наносит %d урона\n", this.name, this.weapon, this.atkCoefficient);
    }
}
