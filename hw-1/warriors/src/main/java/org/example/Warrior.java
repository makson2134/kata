package org.example;

public class Warrior {
    int attack;
    int health;
    String name;

    Warrior(int attack, int health, String name){
        this.attack = attack;
        this.health = health;
        this.name = name;
    }

    void attack(Warrior enemy){
        enemy.health -= this.attack;
        System.out.printf("%s Нанёс %d урона воину %s, теперь у него %d hp\n", this.name, this.attack, enemy.name, enemy.health);
    }
}
